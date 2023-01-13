package pl.zajavka._warsztaty.w10.builder;

import lombok.ToString;

@ToString
public class Car {
    private final String brand;
    private final String model;
    private final Integer year;
    private final String towbar;
    private final String sunRoof;
    private final String skiRack;

    private Car(final CarBuilder carBuilder) {
        this.brand = carBuilder.brand;
        this.model = carBuilder.model;
        this.year = carBuilder.year;
        this.towbar = carBuilder.towbar;
        this.sunRoof = carBuilder.sunRoof;
        this.skiRack = carBuilder.skiRack;
    }

    // gettery
    public static CarBuilder builder() {
        return new CarBuilder();
    }

    public static class CarBuilder {

        private String brand;
        private String model;
        private Integer year;
        private String towbar;
        private String sunRoof;
        private String skiRack;

        public CarBuilder brand(final String brand) {
            this.brand = brand;
            return this;
        }
        public CarBuilder model(final String model) {
            this.model = model;
            return this;
        }
        public CarBuilder year(final Integer year) {
            this.year = year;
            return this;
        }
        public CarBuilder towbar(final String towbar) {
            this.towbar = towbar;
            return this;
        }
        public CarBuilder sunRoof(final String sunRoof) {
            this.sunRoof = sunRoof;
            return this;
        }
        public CarBuilder skiRack(final String skiRack) {
            this.skiRack = skiRack;
            return this;
        }
        public Car build() {
            return new Car(this);
        }
    }

}
