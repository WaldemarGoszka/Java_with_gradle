package lesson23;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Cat();
        Cat cat = (Cat) animal;
        Animal animal1 = new Animal();
        cat.prnt();
    }


}
