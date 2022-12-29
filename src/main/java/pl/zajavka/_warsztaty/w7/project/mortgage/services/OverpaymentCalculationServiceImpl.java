package pl.zajavka._warsztaty.w7.project.mortgage.services;


import pl.zajavka._warsztaty.w7.project.mortgage.model.InputData;
import pl.zajavka._warsztaty.w7.project.mortgage.model.Overpayment;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Optional;

public class OverpaymentCalculationServiceImpl implements OverpaymentCalculationService {

    @Override
    public Overpayment calculate(final BigDecimal rateNumber, final InputData inputData) {
        BigDecimal overpaymentAmount = calculateOverpaymentAmount(rateNumber, inputData.getOverpaymentSchema()).orElse(BigDecimal.ZERO);
        BigDecimal overpaymentProvision = calculateOverpaymentProvision(rateNumber, overpaymentAmount, inputData);
        return new Overpayment(overpaymentAmount, overpaymentProvision);
    }

    private Optional<BigDecimal> calculateOverpaymentAmount(final BigDecimal rateNumber, Map<Integer, BigDecimal> overpaymentSchema) {
        for (Map.Entry<Integer, BigDecimal> entry : overpaymentSchema.entrySet()) {
            if (BigDecimal.valueOf(entry.getKey()).equals(rateNumber)) {
                return Optional.of(entry.getValue());
            }
        }
        return Optional.empty();
    }

    private BigDecimal calculateOverpaymentProvision(final BigDecimal rateNumber, final BigDecimal overpaymentAmount, final InputData inputData) {
        if (BigDecimal.ZERO.equals(overpaymentAmount)) {
            return BigDecimal.ZERO;
        }

        if (rateNumber.compareTo(inputData.getOverpaymentProvisionMonths()) > 0) {
            return BigDecimal.ZERO;
        }

        return overpaymentAmount.multiply(inputData.getOverpaymentProvisionPercent());
    }

}
