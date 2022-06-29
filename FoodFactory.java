import person.Consumer
import person.ConsumingMan;
import person.Producent;
import person.ProducingMan;

import java.util.function.Consumer;

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

    }
}
