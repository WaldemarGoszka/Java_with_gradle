package zajavka.product;

import zajavka.product.person.ConsumingMan;
import zajavka.product.person.ProducingMan;

public class Soup extends Food{
    public Soup(String name, ProducingMan producingMan, ConsumingMan consumingMan) {
        super(name, producingMan, consumingMan);
    }
}
