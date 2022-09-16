package w1.genericUnboundedWildcards;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        List<String> tuna = new ArrayList<>();

        List<?> some;

        print(strings);
        print(tuna);

//        List<Object> list = tuna;  // tak nie mozna zrobić
        List<?> list = tuna;   // tak mozna

    }

    private static void print(List<?> list) {
        for (Object s : list) {
            System.out.println(list);

        }
    }

    static class Tuna{

    }
}
