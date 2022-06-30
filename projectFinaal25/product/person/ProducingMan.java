package projectFinaal25.product.person;

import projectFinaal25.product.Food;

public interface ProducingMan {
    Food produce(String productName, ConsumingMan consumingMan);
}
