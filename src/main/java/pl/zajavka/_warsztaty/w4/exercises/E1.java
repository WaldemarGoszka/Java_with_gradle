package zajavka._warsztaty.w4.exercises;

import java.util.Optional;
import java.util.stream.Stream;

public class E1 {
    public static Double suma = 0.0;
    public static void main(String[] args) {
        Stream<Double> stream = Stream.generate(Math::random);

        stream.limit(100)
                .mapToDouble(Double::doubleValue)
                .peek(value -> getAverage(suma,value)).average();

        System.out.println(suma);
    }

    private static void getAverage(Double sum, double value) {
        suma = suma + value;
    }
}
