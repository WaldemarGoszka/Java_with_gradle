package zajavka._warsztaty.w1.genericsInterface;

public interface Packable<T> {
    void pack(T element);
    T empty();
}
