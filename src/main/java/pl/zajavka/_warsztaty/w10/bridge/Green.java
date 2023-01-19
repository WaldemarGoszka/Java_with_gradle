package pl.zajavka._warsztaty.w10.bridge;

import lombok.ToString;

@ToString
public class Green implements Color{

    @Override
    public String apply() {
        return "Color is Red";
    }
}
