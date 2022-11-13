package zajavka._warsztaty.w1.genericsInterface;

public class Main {
    public static void main(String[] args) {
        PackableBag packableBag = new PackableBag(); // klasa nie wymaga podania generyka bo jest już zainplementowany
                                                    // w środku implementując bezpośrednio z interfejsy Packable<Car>
        PackableBagGeneric<Car> packableBagGeneric = new PackableBagGeneric<>();
                                                    // w tej klasie nie został podanyc generyk czyli Packable<T> więc
                                                    // tutaj musimy podać generyk  przy inicjalizacji obiektu
    }
}
