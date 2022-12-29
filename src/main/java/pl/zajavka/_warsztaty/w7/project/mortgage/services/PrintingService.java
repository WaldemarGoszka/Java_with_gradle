package pl.zajavka._warsztaty.w7.project.mortgage.services;



import pl.zajavka._warsztaty.w7.project.mortgage.model.InputData;
import pl.zajavka._warsztaty.w7.project.mortgage.model.Rate;
import pl.zajavka._warsztaty.w7.project.mortgage.model.Summary;

import java.util.List;

public interface PrintingService {

    String SCHEDULE_TABLE_FORMAT =
        "%-4s %3s " +
            "%-4s %3s " +
            "%-7s %3s " +
            "%-7s %3s " +
            "%-4s %10s " +
            "%-7s %10s " +
            "%-7s %10s " +
            "%-7s %10s " +
            "%-8s %10s " +
            "%-8s %10s ";

    StringBuilder SEPARATOR = createSeparator('-', 180);

    String INTEREST_SUM = "SUMA ODSETEK: ";
    String OVERPAYMENT_PROVISION = "PROWIZJA ZA NADPLATY: ";
    String LOSTS_SUM = "SUMA STRAT: ";
    String CAPITAL_SUM = "SUMA KAPITALU: ";
    String RATE_NUMBER = "NR: ";
    String YEAR = "ROK: ";
    String MONTH = "MIESIAC: ";
    String AMOUNT = "KWOTA: ";
    String DATE = "DATA: ";
    String MONTHS = " MIESIECY ";
    String OVERPAYMENT_REDUCE_RATE = "NADPLATA, ZMNIEJSZENIE RATY";
    String OVERPAYMENT_REDUCE_PERIOD = "NADPLATA, SKROCENIE OKRESU";
    String RATE = "RATA: ";
    String INTEREST = "ODSETKI: ";
    String CAPITAL = "KAPITAL: ";
    String OVERPAYMENT = "NADPLATA: ";
    String LEFT_AMOUNT = "PKWT: ";
    String LEFT_MONTHS = "PMSC: ";
    String BLANK = " ";
    String MORTGAGE_AMOUNT = "KWOTA KREDYTU: ";
    String MORTGAGE_PERIOD = "OKRES KREDYTOWANIA: ";
    String OVERPAYMENT_START_MONTH = "MIESIAC ROZPOCZECIA NADPLAT: ";
    String OVERPAYMENT_FREQUENCY = "SCHEMAT DOKONYWANIA NADPLAT: ";

    String CURRENCY = " ZL ";
    String COMMA = ", ";
    String NEW_LINE = "\n";
    String PERCENT = "% ";

    @SuppressWarnings("SameParameterValue")
    private static StringBuilder createSeparator(char sign, int length) {
        StringBuilder sep = new StringBuilder();
        sep.append(String.valueOf(sign).repeat(Math.max(0, length)));
        return sep;
    }

    void printIntroInformation(InputData inputData);

    void printSchedule(List<Rate> rates, final InputData inputData);

    void printSummary(Summary summaryNoOverpayment);
}
