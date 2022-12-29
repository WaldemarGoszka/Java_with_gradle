package pl.zajavka._warsztaty.w7.project.mortgage.services;



import pl.zajavka._warsztaty.w7.project.mortgage.model.Rate;

import java.math.BigDecimal;

public interface Function {

    BigDecimal calculate(Rate rate);
}
