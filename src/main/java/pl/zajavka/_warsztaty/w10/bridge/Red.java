package pl.zajavka._warsztaty.w10.bridge;

import lombok.ToString;

@ToString
public class Red implements Color{
        @Override
        public String apply() {
            return "Color is Red";
        }
}
