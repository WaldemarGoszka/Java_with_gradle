package pl.zajavka._warsztaty.w10.builder;

public class Main {
    public static void main(String[] args) {
        Car.CarBuilder emptyCar = Car.builder();
        Car build = emptyCar.build();

        Car anotherCar = Car.builder()
                .brand("Ford")
                .model("Mustang")
                .towbar("someTowbar")
                .year(1969)
                .build();

        System.out.println(emptyCar);
        System.out.println(anotherCar);

    }
}
