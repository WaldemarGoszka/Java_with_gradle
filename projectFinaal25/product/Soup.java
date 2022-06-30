package projectFinaal25.product;

import projectFinaal25.product.person.ConsumingMan;
import projectFinaal25.product.person.ProducingMan;

public class Soup extends Food{
    public Soup(String name, ProducingMan producingMan, ConsumingMan consumingMan) {
        super(name, producingMan, consumingMan);
    }
}
