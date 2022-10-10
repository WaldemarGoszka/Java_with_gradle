package w2FunctionProgramingEx.Ex3;

import java.util.Collections;
import java.util.Comparator;
import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        BinaryOperator<Dog> binaryOperator = (d,d2)-> {
            if{
                d.compareTo(d2)
            } > 0 ? d : d2
        };
        Dog apply = binaryOperator.apply(new Dog(2), new Dog(5));
        System.out.println(apply);
    }
}
