package zajavka._warsztaty.w1.genericUpperBoundWildcard;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
        List<Monkey> monkeys = new ArrayList<>();
        List<String> strings = new ArrayList<>();
        List<FlyingDog> flyingDogs = new ArrayList<>();

        List<? extends Dog> abc = dogs;
        System.out.println(abc);
        print(abc);
        System.out.println("---");
        System.out.println(abc);
        System.out.println(dogs);
//         List<? extends Animal> abc = new ArrayList<Dog>();
//        print(animals);
//        print(flyingDogs);
//        animals.add(new Object());
//        print(dogs);
//
//        print(monkeys);
//        print(strings);
//        print(new Object());
    }

    private static void print(List<? extends Dog > list) {
//        list.add(new FlyingDog());
        list.remove(0);
//        list.add(new Animal());
        for (Object o : list) {
            System.out.println(o);
        }

    }

    static class Animal implements Voiceable {

    }
    static class Monkey extends Animal{

    }
    static class Dog extends Animal{

    }
    static class FlyingDog extends Dog{

    }
    interface Voiceable{

    }
}
