package pl.zajavka._warsztaty.w7.project.mortgage.model;

import lombok.Value;

import java.math.BigDecimal;

@Value
public class Overpayment {

    public static final String REDUCE_RATE = "REDUCE_RATE";

    public static final String REDUCE_PERIOD = "REDUCE_PERIOD";

    BigDecimal amount;
    BigDecimal provisionAmount;

}
