package Optional;

import javax.swing.text.html.Option;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

//        Optional<String> str = Optional.of("SomeString");
        Optional<String> str = Optional.empty();
        Optional<Boolean> me = str.map(a -> a.contains("mehh"));
        System.out.println(me);
    }}
