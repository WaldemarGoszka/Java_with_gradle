package zajavka.Collections.Ex1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>(Arrays.asList("one", "two", "three", "four"));
        Iterator<String> setIterator = set.iterator();
        int count = 0;
        while (setIterator.hasNext()){
            count++;
            if(count == set.size()) {
                System.out.print(setIterator.next() + ", ");
            } else {
                System.out.print(setIterator.next());

            }

        }

    }
}
