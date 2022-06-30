package projectFinaal25.product.person;

import projectFinaal25.product.Chocolate;
import projectFinaal25.product.Food;
import projectFinaal25.product.Sandwich;
import projectFinaal25.product.Soup;

public class Producent extends Person implements ProducingMan{
    public Producent(String name, String surname) {
        super(name, surname);
    }

    @Override
    public void consume(Food food){
        System.out.println("Producent consuming food: "+ food);
    }
    @Override
    public Food produce(String productName, ConsumingMan consumingMan){
        switch(productName){
            case "chocolate":
                return new Chocolate(productName,this,consumingMan);
            case "soup":
                return new Soup(productName,this, consumingMan);
            default:
                return new Sandwich(productName,this, consumingMan);
        }
    }

}
