package w1.genericsQuiz.p5;


import java.util.ArrayList;
import java.util.List;


public class Elements {
    public void printFirstElement(List<?> list){
        System.out.println(list.get(0));
    }

    public static void main(String[] args) {
        Elements elements = new Elements();
//        Collection<Elements> list = new ArrayList<>(); //bad
//        List<Elements> list = new ArrayList<>(); //bad
//        List<?> list = new ArrayList<>(); //bad
//        List<? extends Elements> list = new ArrayList<>();
        List<? super Elements> list = new ArrayList<>();
//        List<?> list = new ArrayList<?>(); // bad
        elements.printFirstElement(list);
    }
}
