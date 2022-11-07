package w2.Streams.Excesise;

import java.util.Collection;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Ex5 {
    public static void main(String[] args) {
        String str = "nieeeeeein";
        String noWhite = str.replace(" ", "");
        System.out.println("IsPalindrom :" + isPalindrom(noWhite));
    }

    private static Boolean isPalindrom(String noWhite) {
        String reverted = noWhite
                .chars()
                .mapToObj(c -> String.valueOf( (char)c))
                .reduce("", (a,b)-> a+b);
        return reverted.equals(noWhite);
    }
}

