package projectFinaal25.product;

import projectFinaal25.product.person.Consumer;
import projectFinaal25.product.person.ConsumingMan;
import projectFinaal25.product.person.Producent;
import projectFinaal25.product.person.ProducingMan;

public class FoodFactory {
    public static void main(String[] args) {
FoodFactory foodFactory = new FoodFactory();
foodFactory.run();
    }

    private void run() {
        ProducingMan[] producingPeople = new ProducingMan[]{
            new Producent( "Alicja", "Zupowa"),
            new Producent("Krzysztof", "Ciastkarski")
        };
        ConsumingMan[] consumingPeople = new ConsumingMan[]{
            new Consumer("Rafal", "Pożracz"),
            new Consumer("Angelika","Zajadacz"),
        };
        for (ProducingMan producingPerson:producingPeople
             ) {
            
        }

    }
}
