package zajavka._warsztaty.w1.genericsEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Ex6 {
    public static void main(String[] args) {
        Stack<ItemOnTable> stack = new Stack<>();
        System.out.println(stack);
        stack.put(new Smartphone());
        stack.put(new Newspaper());
        System.out.println(stack);
        System.out.println(stack.get().orElse(null));
        System.out.println(stack);
        System.out.println(stack.get().orElse(null));
        System.out.println(stack);
        System.out.println(stack.get().orElse(null));
        System.out.println(stack);


    }
    public static class Stack<T extends ItemOnTable>{
        private  List<T> stack = new ArrayList<>();

        public void put(T element){
            if(element == null){
                return;
            }
            stack.add(element);
        }
        public Optional get(){
            if (stack.size() == 0){
                return Optional.empty();
            }
            return Optional.ofNullable(stack.remove(stack.size()-1));
        }

        @Override
        public String toString() {
            return stack.toString();
        }
    }
    //Marker Interface
    public static class Smartphone implements ItemOnTable{
        @Override
        public String toString() {
            return "Smartphone{}";
        }
    }
    public static class Newspaper implements ItemOnTable{
        @Override
        public String toString() {
            return "Newspaper{}";
        }
    }
    public static class Book implements ItemOnTable{
        @Override
        public String toString() {
            return "Book{}";
        }
    }
    interface ItemOnTable{

    }
}
