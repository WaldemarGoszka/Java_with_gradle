package Optional;



import org.w3c.dom.ls.LSOutput;

import java.util.Optional;
import java.util.function.Consumer;

public class MainOptinal {
    public static void main(String[] args) {
        Optional<Human> adam = retrieveHuman("mddda");
//        System.out.println(adam.get().getName());
        if(adam.isPresent()) {
            System.out.println("asdasfas");
        }
        adam.ifPresent(a -> System.out.println(a.getName()));
        System.out.println("----");
        System.out.println(adam.orElse( odElseMethod()));
        System.out.println("----");
        System.out.println(adam.orElseGet(() -> {
            System.out.println("to jest z orElseGet");
            return new Human("Nasia");
        }));
        adam.map(h-> h.getName()).filter(f -> f.length() > 4).ifPresent(n -> System.out.println(n));

    }

    private static Human odElseMethod() {
        System.out.println("to jest z OrElse");
        return new Human("Nadia");
    }

    public static Optional<Human> retrieveHuman(final String name){
        return name.endsWith("a") ? Optional.of(new Human(name)) : Optional.empty();
    }
}
