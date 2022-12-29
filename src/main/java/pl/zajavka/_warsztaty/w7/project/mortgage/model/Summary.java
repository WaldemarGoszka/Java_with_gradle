package pl.zajavka._warsztaty.w7.project.mortgage.model;

import lombok.Value;

import java.math.BigDecimal;

@Value
public class Summary {

    BigDecimal interestSum;
    BigDecimal overpaymentProvisionSum;
    BigDecimal totalLostSum;
    BigDecimal totalCapital;

}
