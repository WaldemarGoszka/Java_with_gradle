package pl.zajavka._warsztaty.w10.bridge;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor

public abstract class Shape {
    protected Color color;

    abstract public void draw();

}
