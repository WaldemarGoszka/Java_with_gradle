package pl.zajavka._warsztaty.w10.composite;

public class Main {
    public static void main(String[] args) {
        ZOO zoo = new ZOO();
        zoo.add(new Monkey());
        zoo.add(new Elephant());
        zoo.add(new Tiger());
        zoo.add(new Tiger());
        zoo.eat(new Food());


    }
}
