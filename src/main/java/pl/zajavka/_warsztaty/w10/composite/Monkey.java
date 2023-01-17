package pl.zajavka._warsztaty.w10.composite;

public class Monkey implements Animal{

    @Override
    public void eat(Food food) {
        System.out.println("Monkey eating food: " + food);
    }
}
