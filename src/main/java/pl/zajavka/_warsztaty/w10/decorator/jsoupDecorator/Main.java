package pl.zajavka._warsztaty.w10.decorator.jsoupDecorator;

import org.jsoup.nodes.Attribute;

public class Main {
    public static void main(String[] args) {
        System.out.println("Example 1");
        Attribute attribute1 = new AttributeBeforeDecorator(
                new Attribute("key1", "value1"));
        System.out.println(attribute1.getKey());

        System.out.println();

        System.out.println("Example 2");
        Attribute attribute2 = new AttributeBeforeDecorator(
                new AttributeOtherDecorator(
                        new Attribute("key2", "value2")));
        System.out.println(attribute2.getKey());


    }
}
