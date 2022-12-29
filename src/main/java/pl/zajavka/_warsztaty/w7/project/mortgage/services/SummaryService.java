package pl.zajavka._warsztaty.w7.project.mortgage.services;

import pl.zajavka._warsztaty.w7.project.mortgage.model.Rate;
import pl.zajavka._warsztaty.w7.project.mortgage.model.Summary;


import java.util.List;

public interface SummaryService {

    Summary calculateSummary(List<Rate> rates);
}
