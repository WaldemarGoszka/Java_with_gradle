package w1.genericsClass;

public class CallingBag {
    public static void main(String[] args) {
        Bag<String> bag = new Bag<>();
        bag.pack("String element");
        System.out.println(bag.getElement());
        System.out.println(bag);

        Bag <Car> car = new Bag<>();
        car.pack(new Cabriolet()); // umożliwia zapakowanie Cabrioletu gdyż Cabriolet dziedziczy po Car
    }
    static class Car{

    }
    static class Cabriolet extends Car{

    }
}
