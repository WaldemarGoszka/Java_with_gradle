package Optional;



import java.util.Optional;
import java.util.function.Consumer;

public class MainOptinal {
    public static void main(String[] args) {
        Optional<Human> adam = retrieveHuman("ada");
//        System.out.println(adam.get().getName());
        if(adam.isPresent()) {
            System.out.println("asdasfas");
        }
        adam.ifPresent(a -> System.out.println(a.getName()));

    }

    public static Optional<Human> retrieveHuman(final String name){
        return name.endsWith("a") ? Optional.of(new Human(name)) : Optional.empty();
    }
}
