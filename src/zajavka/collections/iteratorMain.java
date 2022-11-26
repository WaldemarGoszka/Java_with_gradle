package zajavka.collections;

import java.util.*;

public class iteratorMain {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Warszawa","Gdansk","Wroclaw"));

        ListIterator<String> listIterator = list.listIterator();

        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        List<Integer> list2 = Arrays.asList(1,2,3,4);
        list2.remove(3);
    }
}
