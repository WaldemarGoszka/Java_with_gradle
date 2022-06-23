package lesson22;

public class Main {
    public static void main(String[] args) {
        runAnimal(new Cat());
    }
    static public void runAnimal(Animal animal){
        animal.run();
        animal.sing();
    }
}
