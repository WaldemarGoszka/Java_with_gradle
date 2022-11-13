package zajavka.product;

import zajavka.product.person.ConsumingMan;
import zajavka.product.person.ProducingMan;

public class Sandwich extends Food {
    public Sandwich(String name, ProducingMan producingMan, ConsumingMan consumingMan) {
        super(name, producingMan, consumingMan);
    }
}

