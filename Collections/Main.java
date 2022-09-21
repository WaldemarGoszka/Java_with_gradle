package Collections;

import java.util.*;

public class Main {
    private Object name;





    public static void main(String[] args) {
        Set<Integer> integers = new TreeSet<>(Arrays.asList(1,57,4,3,9,0,22,443,5556,5,3,2,88,32,546,688,22,11,90,53,4-));
        for (Integer integer : integers) {
            System.out.print(integer + ",");
        }
        Map<Integer,String> map = new HashMap<>();
        Set<Map.Entry<Integer, String>> entries = map.entrySet();

//    new ArrayList
        List<String> namelist = new ArrayList<>();
        namelist.add("Karol");
        namelist.add("Bartek");

        for (int i = 0; i < namelist.size(); i++) {
            System.out.println(namelist.get(i));
        }
        System.out.println("---");
        for (String element :
                namelist) {
            System.out.println(element);
        }
        System.out.println("--- iterator");
        Iterator<String> namesIterator = namelist.iterator();
//        System.out.println(namesIterator.next());
//        System.out.println(namesIterator.next());
//        if (namesIterator.hasNext())
//            System.out.println(namesIterator.next()); // tu będzie no suchelementException
        while (namesIterator.hasNext()) {  // hasnext sprawdza czy jest poerwszy element czy lista nie jest pusta
            System.out.println(namesIterator.next());
        }
        System.out.println("---listIterator");
        ListIterator<String> nameListIterator = namelist.listIterator();
        while(nameListIterator.hasNext()){
            System.out.println(nameListIterator.next());
        }
        while (nameListIterator.hasPrevious()){ // iterator od końca do przodu. Musi być najpierw przeiterowane na koniec metodą while(hasNext)
            System.out.println(nameListIterator.previous());
        }
        System.out.println("--- konwersion array to list and backwards");
        String[] someArray = {"1", "2","3"};
        List<String> someList1 = Arrays.asList(someArray); // metoda as List nie wpiera dodawania elementóew do listy więc nie możemu wywołać add
        List<String> someList2 = new ArrayList<>(Arrays.asList(someArray)); // tu już będzie dzisłąć add
        System.out.println(Arrays.toString(someArray  ));
        System.out.println(someList1);

        String[] listtoarray = someList1.toArray(new String[0]);
        System.out.println(Arrays.toString(listtoarray)) ;

    }


}
