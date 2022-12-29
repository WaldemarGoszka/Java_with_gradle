package pl.zajavka._warsztaty.w7.project.mortgage.services;

import pl.zajavka._warsztaty.w7.project.mortgage.model.InputData;
import pl.zajavka._warsztaty.w7.project.mortgage.model.Rate;


import java.util.List;

public interface RateCalculationService {

    List<Rate> calculate(InputData inputData);
}
