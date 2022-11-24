package zajavka._warsztaty.w3.Project.domain;

import java.math.BigDecimal;

public class Car {
    private String color;
    private String vin;
    private String company;
    private String model;
    private String modelYear;
    private BigDecimal price;

    public Car(String color, String vin, String company, String model, String modelYear, BigDecimal price) {
        this.color = color;
        this.vin = vin;
        this.company = company;
        this.model = model;
        this.modelYear = modelYear;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", vin='" + vin + '\'' +
                ", company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", modelYear='" + modelYear + '\'' +
                ", price=" + price +
                '}';
    }
}
