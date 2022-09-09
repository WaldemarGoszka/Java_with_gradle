package w1.Comparable;

import Lambda.LambdaInterface;
import projectFinaal25.product.Soup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog(1,"Fafik"));
        dogs.add(new Dog(23,"Zbyszek"));
        dogs.add(new Dog(3,"Niko"));
        dogs.add(new Dog(4,"Stefan"));
        dogs.add(new Dog(6,"Stefan"));
        dogs.add(new Dog(5,"Stefan"));
        dogs.add(new Dog(7,"Kurek"));
        dogs.add(new Dog(10,"Fafik"));
        System.out.println(dogs);
        Collections.sort(dogs);
        System.out.println(dogs);

    }

}
