package pl.zajavka._warsztaty.w7.project.mortgage.services;



import pl.zajavka._warsztaty.w7.project.mortgage.model.*;

import java.math.BigDecimal;

public class ReferenceCalculationServiceImpl implements ReferenceCalculationService {

    @Override
    public MortgageReference calculate(RateAmounts rateAmounts, InputData inputData) {
        if (BigDecimal.ZERO.equals(inputData.getAmount())) {
            return new MortgageReference(BigDecimal.ZERO, BigDecimal.ZERO);
        }

        return new MortgageReference(inputData.getAmount(), inputData.getMonthsDuration());
    }

    @Override
    public MortgageReference calculate(RateAmounts rateAmounts, final InputData inputData, Rate previousRate) {
        if (BigDecimal.ZERO.equals(previousRate.getMortgageResidual().getResidualAmount())) {
            return new MortgageReference(BigDecimal.ZERO, BigDecimal.ZERO);
        }

        switch (inputData.getOverpaymentReduceWay()) {
            case Overpayment.REDUCE_RATE:
                return reduceRateMortgageReference(rateAmounts, previousRate.getMortgageResidual());
            case Overpayment.REDUCE_PERIOD:
                return new MortgageReference(inputData.getAmount(), inputData.getMonthsDuration());
            default:
                throw new MortgageException("Case not handled");
        }

    }

    private MortgageReference reduceRateMortgageReference(final RateAmounts rateAmounts, final MortgageResidual previousResidual) {
        if (rateAmounts.getOverpayment().getAmount().compareTo(BigDecimal.ZERO) > 0) {
            BigDecimal residualAmount = calculateResidualAmount(previousResidual.getResidualAmount(), rateAmounts);
            return new MortgageReference(residualAmount, previousResidual.getResidualDuration().subtract(BigDecimal.ONE));
        }

        return new MortgageReference(previousResidual.getResidualAmount(), previousResidual.getResidualDuration());
    }

    private BigDecimal calculateResidualAmount(final BigDecimal residualAmount, final RateAmounts rateAmounts) {
        return residualAmount
            .subtract(rateAmounts.getCapitalAmount())
            .subtract(rateAmounts.getOverpayment().getAmount())
            .max(BigDecimal.ZERO);
    }

}
