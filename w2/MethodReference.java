package w2;

import java.util.Optional;

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
    }
}
