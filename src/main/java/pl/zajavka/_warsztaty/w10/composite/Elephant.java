package pl.zajavka._warsztaty.w10.composite;

public class Elephant implements Animal{
    @Override
    public void eat(Food food) {
        System.out.println("Elephant eating food: " + food);

    }
}
