package w2.Streams.Excesise;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex2 {
    public static void main(String[] args) {
        String[] letters = {"z","x","a","j","a","v","x","k","a","x"};
        String stream = Stream.of(letters)
                .map(a -> a.toUpperCase())
                .filter(a -> !a.equals("X"))
                .sorted(Comparator.<String>naturalOrder().reversed())
                .collect(Collectors.joining());
//                .reduce((a, b) -> a + b).ifPresent(a -> System.out.println(a));
        System.out.println(stream);
    }
}
