package pl.zajavka._warsztaty.w10.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

public class LambdaPizzaFactory {

    final static Map<String, Supplier<Pizza>> PIZZA_MAP = new HashMap<>();

    static {
        PIZZA_MAP.put("Pepperoni", PepperoniPizza::new);
        PIZZA_MAP.put("Hawaiian", HawaiianPizza::new);
    }

    public static Pizza preparePizza(String pizzaType){
        return Optional.of(PIZZA_MAP.get(pizzaType))
                .map(Supplier::get)
                .orElseThrow(() -> new RuntimeException(
                        String.format("I'm sorry, we don't know what [%s] is!", pizzaType)));
    }

}
