package lesson19.animal1;

import lesson19.aminal2.Animal;

public class Cat extends Animal {
    public void run () {
        Animal animal = new Animal();

    }

    @Override
    public String toString() {
        return "Cat{" +
                "numberOfLegsProtected=" + numberOfLegsProtected +
                ", numbersOfLegs=" + numbersOfLegs +
                '}';
    }
}
