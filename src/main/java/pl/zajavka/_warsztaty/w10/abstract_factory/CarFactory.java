package pl.zajavka._warsztaty.w10.abstract_factory;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

public class CarFactory implements AbstractFactory<Car> {
    final static Map<String, Supplier<Car>> CAR_MAP = new HashMap<>();

    static {
        CAR_MAP.put("SUV", SUV::new);
        CAR_MAP.put("Cabriolet", Cabriolet::new);
    }

    @Override
    public Car create(String type) {
        return Optional.of(CAR_MAP.get(type))
                .map(Supplier::get)
                .orElseThrow(() -> new RuntimeException(
                        String.format("I'm sorry, we don't know what [%s] is!", type)));
    }
}
