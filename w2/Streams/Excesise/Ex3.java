package w2.Streams.Excesise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ex3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,1,2,3,5,6,5,7,2,3,2);
        Integer stream = list.stream()
                .sorted(Comparator.comparingInt(a -> a))
                .distinct()
                .skip(1)
                .findFirst()
                .orElse(-1);
        System.out.println(stream);
     }
}
