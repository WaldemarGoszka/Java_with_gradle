package zajavka.product;

import zajavka.product.person.ConsumingMan;
import zajavka.product.person.ProducingMan;

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
