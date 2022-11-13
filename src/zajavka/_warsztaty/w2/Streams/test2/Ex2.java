package zajavka._warsztaty.w2.Streams.test2;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class Ex2 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.generate(() -> "zajavka");
        Predicate<String> predicate = a -> a.contains("avka");
        System.out.println("step1");
        boolean match1 = stream.anyMatch(predicate);
        System.out.println("step2");
        boolean match2 = stream.allMatch(predicate);

        System.out.println("step3");
        boolean match3 = stream.noneMatch(predicate);

        System.out.println("step4");
        System.out.println("match1: " + match1 + " match2: " + match2 + " match3: " + match3);


    }

}
