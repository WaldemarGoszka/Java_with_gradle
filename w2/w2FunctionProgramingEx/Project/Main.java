package w2.w2FunctionProgramingEx.Project;

import java.util.Optional;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Function<Dog, String> function = Transformer.getToStringFunction();
        Optional<String> optional = Optional.of(dog).map(function);
        System.out.println(optional);

        UnaryOperator<Integer> unaryOperator = Transformer.getUnaryOperator();
        Optional<Integer> optional1 = Optional.of(5).map(unaryOperator);
        System.out.println(optional1);
    }

    static class Dog {
        private String name;

        @Override
        public String toString() {
            return "Dog{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
