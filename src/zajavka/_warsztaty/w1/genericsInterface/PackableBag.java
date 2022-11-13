package zajavka._warsztaty.w1.genericsInterface;

public class PackableBag implements Packable<Car>{

    @Override
    public void pack(Car element) {

    }

    @Override
    public Car empty() {
        return null;
    }
}
