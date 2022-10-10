package w2.w2FunctionProgramingEx.Project;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Transformer {

    public static <T,U extends String> Function<T, U> getToStringFunction() {
        return (T t) -> {
            System.out.println("getting toString:");
            return (U)t.toString();
        };


    }

    public static <T extends Number> UnaryOperator<T> getUnaryOperator() {
        return (T t) -> (T) Integer.valueOf(t.intValue()  * 2);
    }
}
