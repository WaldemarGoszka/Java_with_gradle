package w1.Comparator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("a", "1", "b", "2", "c");
        System.out.println("Example array: " + strings);

        Comparator<String> comparator = Comparator.naturalOrder();
        strings.sort(comparator.reversed());
        System.out.println("First method reversed: " + strings);

        Comparator<String> comparatorReverse = Comparator.<String>naturalOrder().reversed();
        strings.sort(comparatorReverse);
        System.out.println("Second method reversed: " + strings);

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat(1, "Filemon"));
        cats.add(new Cat(3, "Zbyszek"));
        cats.add(new Cat(2, "Rafał"));
        cats.add(new Cat(4, "Stefan"));
        System.out.println(cats);

//        CatComparator catComparator = new CatComparator();
//        cats.sort(catComparator);
//        System.out.println(cats);

        Comparator<Cat> myFirstComparator = new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                return o1.getId() - o2.getId();
            }
        };
        cats.sort(myFirstComparator);
        System.out.println(cats);


    }
}
