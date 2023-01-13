package pl.zajavka._warsztaty.w10.factory;

public class Main {
    public static void main(String[] args) {
        Pizza pepperoni = PizzaFactory.preparePizza("Pepperoni");
        System.out.println(pepperoni);
        Pizza hawaiian = PizzaFactory.preparePizza("Hawaiian");
        System.out.println(hawaiian);
    }
}
