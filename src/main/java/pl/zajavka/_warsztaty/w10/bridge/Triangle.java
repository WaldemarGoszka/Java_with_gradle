package pl.zajavka._warsztaty.w10.bridge;

import lombok.ToString;

@ToString(callSuper = true)
public class Triangle extends Shape {

    public Triangle(final Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Triangle with color: " + color.apply());
    }
}

