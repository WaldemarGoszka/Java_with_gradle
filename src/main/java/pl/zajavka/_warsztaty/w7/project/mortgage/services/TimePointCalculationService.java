package pl.zajavka._warsztaty.w7.project.mortgage.services;

import pl.zajavka._warsztaty.w7.project.mortgage.model.InputData;
import pl.zajavka._warsztaty.w7.project.mortgage.model.Rate;
import pl.zajavka._warsztaty.w7.project.mortgage.model.TimePoint;

import java.math.BigDecimal;

public interface TimePointCalculationService {

    TimePoint calculate(final BigDecimal rateNumber, final InputData inputData);

    TimePoint calculate(BigDecimal rateNumber, Rate previousRate);

}
