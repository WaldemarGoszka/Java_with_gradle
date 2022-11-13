package zajavka._warsztaty.w1.genericsEx;
import java.util.*;

public class Ex5 {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,2,3,5,11,17,105);
        List<Double> doubles = Arrays.asList(1.2,2.2,3.2,5.2,11.2,17.2,105.2);
        List<Long> longs = Arrays.asList(1L,2L,3L,5L,11L,17L,105L);
        List<Float> floats = Arrays.asList(1.2f,2.2f,3.2f,5.2f,11.2f,17.2f,105.2f);

        System.out.println(maxValue(integers, 0,17).orElse(null));
        System.out.println(maxValue(doubles, 0.2,17.3).orElse(null));
        System.out.println(maxValue(longs, 0L,110L).orElse(null));
        System.out.println(maxValue(floats, 0.2f,5.3f).orElse(null));
    }
    static <T extends Number> Optional<T> maxValue(List<T> list, T startSearch, T endSearch){
        T tempMaxResult = null;
        for (T element : list) {
            if(element.doubleValue() >= startSearch.doubleValue() && element.doubleValue() < endSearch.doubleValue()){
                if(Objects.isNull(tempMaxResult) || element.doubleValue() > tempMaxResult.doubleValue()){
                    tempMaxResult = element;
                }
            }
        }

        return Optional.ofNullable(tempMaxResult);
    }
}
