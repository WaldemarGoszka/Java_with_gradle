package zajavka.Debuging;

public class Cat extends Animal{
    private int numbersOfLeg = 5;
    public Cat(String name) {
        super(name);
        System.out.println("Cat constructor");
    }

    public int getNumbersOfLeg() {
        System.out.println(numbersOfLeg);
        return numbersOfLeg;
    }
}
