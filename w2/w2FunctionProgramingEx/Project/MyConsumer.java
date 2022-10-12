package w2.w2FunctionProgramingEx.Project;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MyConsumer {
    public void methodConsumer(Consumer<String> consumer){
        consumer.accept("123");

    }
    public void methodSupplier(Supplier supplier){
        supplier.get();

    }
    public void methodFunction(Function<String> function){
        function.apply("12346");

    }
}
