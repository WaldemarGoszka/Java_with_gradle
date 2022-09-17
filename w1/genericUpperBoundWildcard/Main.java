package w1.genericUpperBoundWildcard;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        List<Dog> dogs = new ArrayList<>();
        List<Monkey> monkeys = new ArrayList<>();
        List<String> strings = new ArrayList<>();

        List<? extends Animal> abc = monkeys;
        abc.add(new );
//         List<? extends Animal> abc = new ArrayList<Dog>();
        print(animals);
        print(dogs);
        print(monkeys);
//        print(strings);
    }

    private static void print(List<? extends Voiceable> list) {
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
    interface Voiceable{

    }
}
