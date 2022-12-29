package pl.zajavka._warsztaty.w7.project.mortgage.services;


import pl.zajavka._warsztaty.w7.project.mortgage.model.InputData;
import pl.zajavka._warsztaty.w7.project.mortgage.model.Overpayment;
import pl.zajavka._warsztaty.w7.project.mortgage.model.Rate;
import pl.zajavka._warsztaty.w7.project.mortgage.model.RateAmounts;

public interface DecreasingAmountsCalculationService {

    RateAmounts calculate(InputData inputData, Overpayment overpayment);

    RateAmounts calculate(InputData inputData, Overpayment overpayment, Rate previousRate);
}
