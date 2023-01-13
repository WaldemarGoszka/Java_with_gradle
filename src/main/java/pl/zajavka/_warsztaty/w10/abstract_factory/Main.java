package pl.zajavka._warsztaty.w10.abstract_factory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory<?> pizzaFactory = FactoryProvider.getFactory("Pizza");
        Object pepperoni = pizzaFactory.create("Pepperoni");
        System.out.println((PepperoniPizza)pepperoni);

        Object o = FactoryProvider.getFactory("Pizza").create("Hawaiian");
        System.out.println(o);
    }
}
