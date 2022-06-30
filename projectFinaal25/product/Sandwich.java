package projectFinaal25.product;

import projectFinaal25.product.person.ConsumingMan;
import projectFinaal25.product.person.ProducingMan;

public class Sandwich extends Food {
    public Sandwich(String name, ProducingMan producingMan, ConsumingMan consumingMan) {
        super(name, producingMan, consumingMan);
    }
}

