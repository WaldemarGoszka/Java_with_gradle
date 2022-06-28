package person;

import product.Food;

public interface ProducingMan {
    Food produce(String productName, ConsumingMan consumingMan);
}
