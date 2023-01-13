package pl.zajavka._warsztaty.w10.abstract_factory;

public interface AbstractFactory<T> {
    T create(String type);
}
