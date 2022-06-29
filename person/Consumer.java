package person;

import product.Food;

public class Consumer extends Person{
    public Consumer(String name, String surname) {
        super(name, surname);
    }

    @Override
    public void consume(Food food) {

    }
}
