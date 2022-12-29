package pl.zajavka._warsztaty.w7.project.mortgage;


import pl.zajavka._warsztaty.w7.project.mortgage.model.InputData;
import pl.zajavka._warsztaty.w7.project.mortgage.model.MortgageType;
import pl.zajavka._warsztaty.w7.project.mortgage.model.Overpayment;
import pl.zajavka._warsztaty.w7.project.mortgage.services.*;


import java.math.BigDecimal;
import java.util.Map;
import java.util.TreeMap;

public class MortgageCalculator {

    public static void main(String[] args) {

        // To jest rodzaj mapy, który w tym przypadku trzyma klucze posortowane rosnąco.
        // Wiem, że nie tłumaczyłem go wcześniej. Spokojnie, jeszcze będzie ;)
        Map<Integer, BigDecimal> overpaymentSchema = new TreeMap<>();
        overpaymentSchema.put(5, BigDecimal.valueOf(12000));
        overpaymentSchema.put(19, BigDecimal.valueOf(10000));
        overpaymentSchema.put(28, BigDecimal.valueOf(11000));
        overpaymentSchema.put(64, BigDecimal.valueOf(16000));
        overpaymentSchema.put(78, BigDecimal.valueOf(18000));

        // Ważne jest to aby zwrócić uwagę, na to, które dane wejściowe są nadpisywane przez withery
        InputData defaultInputData = InputData.defaultInputData()
            .withAmount(new BigDecimal("296192.11"))
            .withMonthsDuration(BigDecimal.valueOf(360))
            .withOverpaymentReduceWay(Overpayment.REDUCE_RATE)
            .withRateType(MortgageType.DECREASING)
            .withOverpaymentSchema(overpaymentSchema);

        PrintingService printingService = new PrintingServiceImpl();
        RateCalculationService rateCalculationService = new RateCalculationServiceImpl(
            new TimePointCalculationServiceImpl(),
            new OverpaymentCalculationServiceImpl(),
            new AmountsCalculationServiceImpl(
                new ConstantAmountsCalculationServiceImpl(),
                new DecreasingAmountsCalculationServiceImpl()
            ),
            new ResidualCalculationServiceImpl(),
            new ReferenceCalculationServiceImpl()
        );

        MortgageCalculationService mortgageCalculationService = new MortgageCalculationServiceImpl(
            rateCalculationService,
            printingService,
            SummaryServiceFactory.create()
        );

        mortgageCalculationService.calculate(defaultInputData);
    }
}
