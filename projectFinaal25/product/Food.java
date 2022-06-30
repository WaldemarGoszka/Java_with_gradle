package projectFinaal25.product;

import projectFinaal25.product.person.ConsumingMan;
import projectFinaal25.product.person.ProducingMan;

public abstract class Food {

    private final String name;
    private final ProducingMan producingMan;
    private final ConsumingMan consumingMan;

    public Food(String name, ProducingMan producingMan, ConsumingMan consumingMan) {
        this.name = name;
        this.producingMan = producingMan;
        this.consumingMan = consumingMan;
    }
}
