package pl.zajavka._warsztaty.w10.chainOfResponsibility;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.With;

import java.util.List;

@Data
@With
@AllArgsConstructor(staticName = "of")
public class Car {

    private Type type;
    private String color;
    private List<String> equipment;

    enum Type {
        CABRIOLET,
        JEEP
    }
}
