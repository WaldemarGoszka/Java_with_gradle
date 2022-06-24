package lesson22;

public class Main {
    public static void main(String[] args) {
//        runAnimal(new Cat());
        Animal[] animals= new Animal[5];
//        Animal animal = new Animal();
        for (int i = 0; i < animals.length; i++) {
            if(i % 2 == 0){
                animals[i] = new Mouse();
            } else {
                animals[i] = new Ostrich();
            }
        }
        for (Animal animals: animals) {
            animals.live();
        }
    }
    static public void runAnimal(Animal animal){
        animal.run();
        animal.sing();
    }
}
