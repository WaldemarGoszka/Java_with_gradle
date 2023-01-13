package pl.zajavka._warsztaty.w10.abstract_factory;


import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

public class PizzaFactory implements AbstractFactory<Pizza> {
    final static Map<String, Supplier<Pizza>> PIZZA_MAP = new HashMap<>();

    static {
        PIZZA_MAP.put("Pepperoni", PepperoniPizza::new);
        PIZZA_MAP.put("Hawaiian", HawaiianPizza::new);
    }

    @Override
    public Pizza create(String type) {
        return Optional.of(PIZZA_MAP.get(type))
                .map(Supplier::get)
                .orElseThrow(() -> new RuntimeException(
                        String.format("I'm sorry, we don't know what [%s] is!", type)));
    }
}
