package lesson19.aminal2;

import java.util.Objects;

public class Animal {
    protected int numberOfLegsProtected = 5;
    private int numberOfLegsPrivate = 6;
    int numberOfLegsDefault  = 4;
    public int numbersOfLegs = 4;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return numberOfLegsProtected == animal.numberOfLegsProtected && numberOfLegsPrivate == animal.numberOfLegsPrivate && numberOfLegsDefault == animal.numberOfLegsDefault && numbersOfLegs == animal.numbersOfLegs;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfLegsProtected, numberOfLegsPrivate, numberOfLegsDefault, numbersOfLegs);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "numberOfLegsProtected=" + numberOfLegsProtected +
                ", numberOfLegsPrivate=" + numberOfLegsPrivate +
                ", numberOfLegsDefault=" + numberOfLegsDefault +
                ", numbersOfLegs=" + numbersOfLegs +
                '}';
    }
}
