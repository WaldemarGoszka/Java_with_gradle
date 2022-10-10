package w2.w2FunctionProgramingEx.Ex3;

import java.util.Optional;
import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        BinaryOperator<Dog> binaryOperator = (d,d2)-> {
            if(d.compareTo(d2) > 0){
                return d;
            } else if (d.compareTo(d2) < 0) {
                return d2;
            }
            return null;
        };
        Dog dog_is_equals = Optional.ofNullable(binaryOperator.apply(new Dog(6), new Dog(5)))
                .orElseThrow(() ->  new MyException("dog is equals"));

        System.out.println(dog_is_equals);
    }
    private static class MyException extends RuntimeException{
        public MyException(String message) {
            super(message);
        }
    }
}
