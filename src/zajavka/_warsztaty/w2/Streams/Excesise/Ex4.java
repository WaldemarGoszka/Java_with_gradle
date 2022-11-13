package zajavka._warsztaty.w2.Streams.Excesise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ex4 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,1,2,3,5,6,5,7,2,3,2,22);
        Integer stream = list.stream()
                .sorted(Comparator.<Integer>naturalOrder().reversed())
                .distinct()
                .skip(1)

                .findFirst()
                .orElseThrow(()-> new  RuntimeException());
        System.out.println(stream);
    }
}
