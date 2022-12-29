package pl.zajavka._warsztaty.w7.project.mortgage.services;

import lombok.RequiredArgsConstructor;
import pl.zajavka._warsztaty.w7.project.mortgage.model.InputData;
import pl.zajavka._warsztaty.w7.project.mortgage.model.Overpayment;
import pl.zajavka._warsztaty.w7.project.mortgage.model.Rate;
import pl.zajavka._warsztaty.w7.project.mortgage.model.RateAmounts;


@RequiredArgsConstructor
public class AmountsCalculationServiceImpl implements AmountsCalculationService {

    private final ConstantAmountsCalculationService constantAmountsCalculationService;

    private final DecreasingAmountsCalculationService decreasingAmountsCalculationService;

    @Override
    public RateAmounts calculate(final InputData inputData, final Overpayment overpayment) {
        switch (inputData.getRateType()) {
            case CONSTANT:
                return constantAmountsCalculationService.calculate(inputData, overpayment);
            case DECREASING:
                return decreasingAmountsCalculationService.calculate(inputData, overpayment);
            default:
                throw new MortgageException("Case not handled");
        }
    }

    @Override
    public RateAmounts calculate(final InputData inputData, final Overpayment overpayment, final Rate previousRate) {
        switch (inputData.getRateType()) {
            case CONSTANT:
                return constantAmountsCalculationService.calculate(inputData, overpayment, previousRate);
            case DECREASING:
                return decreasingAmountsCalculationService.calculate(inputData, overpayment, previousRate);
            default:
                throw new MortgageException("Case not handled");
        }
    }


}
