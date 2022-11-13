package zajavka.product;

import zajavka.product.person.ConsumingMan;
import zajavka.product.person.ProducingMan;

public class Chocolate extends Food {
    public Chocolate(String name, ProducingMan producingMan, ConsumingMan consumingMan) {
        super(name, producingMan, consumingMan);
    }
}
