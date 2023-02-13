package pl.zajavka._warsztaty;

import lombok.Value;

import java.util.function.Predicate;

@Value
public class FilteringBag<T ,U extends Predicate<T>, V extends Predicate<T>> {
    private T element;
    private final V filter1;
    private final V filter2;

    public FilteringBag(V filter1, V filter2) {
        this.filter1 = filter1;
        this.filter2 = filter2;
        this.filter = filter3;
    }
}
