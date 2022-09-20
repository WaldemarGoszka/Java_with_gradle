package w1.genericsEx;

import java.util.ArrayList;
import java.util.List;

public class Ex5 {
    public static void main(String[] args) {
        System.out.println();
    }
    public static class Stack<T extends ItemOnTable>{
        private  List<T> stack = new ArrayList<>();

        public  void put(T element){
            stack.add(element);
        }
        public  <T> get(){
            return T stack.get(stack.size()-1);
        }

    }
    public static class Smartphone implements ItemOnTable{

    }
    public static class Newspaper implements ItemOnTable{

    }
    public static class Book implements ItemOnTable{

    }
    interface ItemOnTable{

    }
}
