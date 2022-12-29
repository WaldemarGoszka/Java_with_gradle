package pl.zajavka._warsztaty.w7.project.mortgage.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum MortgageType {
    CONSTANT("CONSTANT"),
    DECREASING("DECREASING");

    @Getter
    private final String value;

}
