package pl.zajavka._warsztaty.w7.project.mortgage.services;



import pl.zajavka._warsztaty.w7.project.mortgage.model.InputData;
import pl.zajavka._warsztaty.w7.project.mortgage.model.Overpayment;
import pl.zajavka._warsztaty.w7.project.mortgage.model.Rate;
import pl.zajavka._warsztaty.w7.project.mortgage.model.Summary;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class PrintingServiceImpl implements PrintingService {

    @Override
    public void printIntroInformation(InputData inputData) {
        StringBuilder msg = new StringBuilder(NEW_LINE);
        msg.append(MORTGAGE_AMOUNT).append(inputData.getAmount()).append(CURRENCY);
        msg.append(NEW_LINE);
        msg.append(MORTGAGE_PERIOD).append(inputData.getMonthsDuration()).append(MONTHS);
        msg.append(NEW_LINE);
        msg.append(INTEREST).append(inputData.getInterestToDisplay()).append(PERCENT);
        msg.append(NEW_LINE);
        msg.append(OVERPAYMENT_START_MONTH).append(inputData.getOverpaymentStartMonth()).append(BLANK).append(MONTH);

        Optional.of(inputData.getOverpaymentSchema())
            .filter(schema -> schema.size() > 0)
            .ifPresent(schema -> logOverpayment(msg, inputData.getOverpaymentSchema(), inputData.getOverpaymentReduceWay()));

        logMessage(msg);
    }

    private void logOverpayment(final StringBuilder msg, final Map<Integer, BigDecimal> schema, final String reduceWay) {
        switch (reduceWay) {
            case Overpayment.REDUCE_PERIOD:
                msg.append(OVERPAYMENT_REDUCE_PERIOD);
                break;
            case Overpayment.REDUCE_RATE:
                msg.append(OVERPAYMENT_REDUCE_RATE);
                break;
            default:
                throw new MortgageException("Case not handled");
        }
        msg.append(NEW_LINE);
        msg.append(OVERPAYMENT_FREQUENCY).append(NEW_LINE).append(prettyPrintOverpaymentSchema(schema));
    }

    private String prettyPrintOverpaymentSchema(Map<Integer, BigDecimal> schema) {
        StringBuilder schemaMsg = new StringBuilder();
        for (Map.Entry<Integer, BigDecimal> entry : schema.entrySet()) {
            schemaMsg.append(MONTH)
                .append(entry.getKey())
                .append(COMMA)
                .append(AMOUNT)
                .append(entry.getValue())
                .append(CURRENCY)
                .append(NEW_LINE);
        }
        return schemaMsg.toString();
    }

    @Override
    public void printSchedule(final List<Rate> rates, final InputData inputData) {
        if (!inputData.isMortgagePrintPayoffsSchedule()) {
            return;
        }

        int index = 1;
        for (Rate rate : rates) {
            if (rate.getRateNumber().remainder(BigDecimal.valueOf(inputData.getMortgageRateNumberToPrint())).equals(BigDecimal.ZERO)) {
                String logMessage = String.format(SCHEDULE_TABLE_FORMAT,
                    RATE_NUMBER, rate.getRateNumber(),
                    YEAR, rate.getTimePoint().getYear(),
                    MONTH, rate.getTimePoint().getMonth(),
                    DATE, rate.getTimePoint().getDate(),
                    RATE, rate.getRateAmounts().getRateAmount(),
                    INTEREST, rate.getRateAmounts().getInterestAmount(),
                    CAPITAL, rate.getRateAmounts().getCapitalAmount(),
                    OVERPAYMENT, rate.getRateAmounts().getOverpayment().getAmount(),
                    LEFT_AMOUNT, rate.getMortgageResidual().getResidualAmount(),
                    LEFT_MONTHS, rate.getMortgageResidual().getResidualDuration()
                );
                logMessage(logMessage);
                if (index % AmountsCalculationService.YEAR.intValue() == 0) {
                    logSeparator(SEPARATOR);
                }
                index++;
            }
        }
        logMessage(NEW_LINE);
    }

    @Override
    public void printSummary(final Summary summary) {
        StringBuilder msg = new StringBuilder();
        msg.append(INTEREST_SUM).append(summary.getInterestSum()).append(CURRENCY);
        msg.append(NEW_LINE);
        msg.append(OVERPAYMENT_PROVISION).append(summary.getOverpaymentProvisionSum().setScale(2, RoundingMode.HALF_UP)).append(CURRENCY);
        msg.append(NEW_LINE);
        msg.append(LOSTS_SUM).append(summary.getTotalLostSum().setScale(2, RoundingMode.HALF_UP)).append(CURRENCY);
        msg.append(NEW_LINE);
        msg.append(CAPITAL_SUM).append(summary.getTotalCapital().setScale(2, RoundingMode.HALF_UP)).append(CURRENCY);
        msg.append(NEW_LINE);

        logMessage(msg);
    }

    @SuppressWarnings("SameParameterValue")
    private void logSeparator(StringBuilder sep) {
        logMessage(sep);
    }

    private void logMessage(StringBuilder message) {
        logMessage(message.toString());
    }

    private void logMessage(String message) {
        System.out.println(message);
    }

}
