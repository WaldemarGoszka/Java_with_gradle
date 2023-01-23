package pl.zajavka._warsztaty.w10.observer;

public interface Subject {
    void register(Observer observer);
    void unregister(Observer observer);

}
