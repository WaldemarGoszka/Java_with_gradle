package zajavka._warsztaty.w1.genericsInterface;

public class PackableBagGeneric<T> implements Packable<T> {
    @Override
    public void pack(T element) {

    }

    @Override
    public T empty() {
        return null;
    }
}
