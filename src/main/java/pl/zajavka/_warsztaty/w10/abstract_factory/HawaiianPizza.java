package pl.zajavka._warsztaty.w10.abstract_factory;

public class HawaiianPizza implements Pizza {
    @Override
    public String whatSauce() {
        return "Tomato";
    }

    @Override
    public void bake() {
        System.out.println("I'm baking my pineapple!");
    }

    public void morePineapple() {
        System.out.println("More pineapple!");
    }

}
