package zajavka.product;

import zajavka.product.person.Consumer;
import zajavka.product.person.ConsumingMan;
import zajavka.product.person.Producent;
import zajavka.product.person.ProducingMan;

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
