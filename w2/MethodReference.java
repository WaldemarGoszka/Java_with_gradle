package w2;



import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.*;

public class MethodReference {
    public static void main(String[] args) {
        MethodReference methodReference = new MethodReference();
        methodReference.run();
    }

    private void run() {
        DogPrinter dogPrinter = new DogPrinter();
        Dog dog = new Dog("burek");
        String someDog = Optional.of(dog).map(Dog::getName).orElse("some other Dog");
        System.out.println(someDog);
        Optional.of(new Dog("next Burek")).ifPresent(dogPrinter::printDog);

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("fafik"));
        dogs.add(new Dog("burek"));
//        dogs.sort((a,b) -> a.getName().compareTo(b.getName()));
        dogs.sort(Comparator.comparing(Dog::getName));
        System.out.println(dogs);
        Owner owner = new Owner();
        Dog dog1 = Optional.of(owner).map(Dog::new).orElse(new Dog(new Owner()));


    }
}
