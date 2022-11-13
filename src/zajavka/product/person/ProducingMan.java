package zajavka.product.person;

import zajavka.product.Food;

public interface ProducingMan {
    Food produce(String productName, ConsumingMan consumingMan);
}
