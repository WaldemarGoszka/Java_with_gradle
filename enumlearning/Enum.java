package enumlearning;

import java.util.Arrays;

public class Enum {
    public static void main(String[] args) {
        Animal animal2 = getGiraffe();
        Animal animal = getForog();
        System.out.println(animal == animal2);
        Animal.values();
        System.out.println("val: " + Animal.values().toString());
        System.out.println(Animal.valueOf("GIRAFFE"));
        switch (animal) {


        }
    }


    private static Animal getGiraffe() {
        return Animal.GIRAFFE;
    }

    private static Animal getForog() {
        return Animal.FOROG;
    }
}
