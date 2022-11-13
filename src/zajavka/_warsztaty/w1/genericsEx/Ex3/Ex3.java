package zajavka._warsztaty.w1.genericsEx.Ex3;

import java.util.Arrays;
import java.util.Collection;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class Ex3 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7,8));
        System.out.println(collectionCounter(set,(a) -> a % 2 ==0));


    }

    public static <T extends Collection<E>,E, F extends Predicate<E>> int collectionCounter(T collections, F predicate){
        int counter = 0;
        for (E collection : collections) {
            if(predicate.test(collection)) {
                counter++;
            }
        }
        return counter;

        // 2 wersja zapisania  generyków w metodzie
    }public static <E> int collectionCounter2(Collection<E> collections, Predicate<E> predicate){
        int counter = 0;
        for (E collection : collections) {
            if(predicate.test(collection)) {
                counter++;
            }
        }
        return counter;
    }

}
