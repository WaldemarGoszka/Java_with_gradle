package zajavka._warsztaty.w2.Streams.test2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Ex6 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Szczecin", "Zakopane", "Gdynia");
        String result = strings.stream().reduce("Cities: ", (left, right) -> right);
        System.out.println(result);
        System.out.println(strings.stream().filter(a -> a.length()>7).collect(Collectors.joining(";"))+ ";");
        Optional.of("").ifPresent(System.out::println);
    }
}
