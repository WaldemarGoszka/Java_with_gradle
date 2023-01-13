package pl.zajavka._warsztaty.w10.abstract_factory;


public class PepperoniPizza implements Pizza {
    @Override
    public String whatSauce() {
        return "Spicy";
    }

    @Override
    public void bake() {
        System.out.println("I'm soo baking!");
    }

    public void beMoreSpicy() {
        System.out.println("Be prepared!");
    }

}
