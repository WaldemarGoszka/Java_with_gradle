package zajavka._warsztaty.w2.Streams.Excesise;

import java.util.stream.IntStream;

public class Ex1 {
    public static void main(String[] args) {
        //Napisz funkcyjną implementacje silni
        Integer fractional = calculateFractional(5);
        System.out.println(fractional);

    }

    private static Integer calculateFractional(int i) {
        return IntStream.rangeClosed(1,i).reduce(1,(a,b) -> a * b);

    }
}
