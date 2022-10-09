package w2FunctionProgramingEx.Ex1;

import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        BiFunction<Integer,Double,String> biFunction = Main::getString;
        System.out.println(biFunction.apply(3,2.1));
    }

    private static String getString(Integer someInteger, Double someDouble) {
        System.out.println("Passed argument1: " + someInteger);
        System.out.println("Passed argument2: " + someDouble);
        return "" + someDouble + someInteger;
    }
}
