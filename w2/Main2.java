package w2;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main2 {
    public static void main(String[] args) {
        Inter2 predicate = a -> getRun(a);
        System.out.println(predicate);
    }

    private static void getRun(String a) {
        run(a);
    }

    private static int getGgg() {
        System.out.println("ggg");
        return 1;
    }

    private static String getString(String a) {
        return "zzajavka" + a;
    }

    private static void run(String a) {
        getGgg();
    }
}
