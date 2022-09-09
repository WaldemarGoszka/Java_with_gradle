package Enum.Learn;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Volkswagen volkswagen = Volkswagen.PASSAT;
        System.out.println(volkswagen);

        Volkswagen[] values = Volkswagen.values();
        System.out.println(Arrays.toString(values));

        Volkswagen golf = Volkswagen.valueOf("GOLF");
        System.out.println(golf);

        System.out.println(Volkswagen.GOLF.someMethod());
        System.out.println(volkswagen.someMethod());

        Volkswagen v1 = Volkswagen.GOLF;
        Volkswagen v2 = Volkswagen.GOLF;
        System.out.println(v1 == v2);
        System.out.println(Volkswagen.GOLF);
    }


}
