package zajavka._warsztaty.w1.genericsClass;

import java.util.function.Predicate;

public class CallingBag {
    public static void main(String[] args) {
        Bag<String> bag = new Bag<>();
        bag.pack("String element");
        System.out.println(bag.getElement());
        System.out.println(bag);

        Bag <Car> car = new Bag<>();
        car.pack(new Cabriolet()); // umożliwia zapakowanie Cabrioletu gdyż Cabriolet dziedziczy po Car
        System.out.println("-----------------------");
        
        callFilteringBag();
    }

    private static void callFilteringBag() {
        Car2 car2 = new Car2("red", 2020);
        FilteringBag<Car2, Predicate<Car2>, Predicate<Car2>> filteringBag = new FilteringBag<>(
                c -> c.getColor().equals("red"),
                c -> c.getYear().equals(2020)
        );
        filteringBag.pack(car2);
    }

    static class Car{


    }
    static class Car2{  // class for callFilteringBag
        private String color;
        private int year;

        public Car2(String color, int year) {
            this.color = color;
            this.year = year;
        }

        public String getColor() {
            return color;
        }

        public Integer getYear() {
            return year;
        }
    }
    static class Cabriolet extends Car{

    }
}
