package w2.w2FunctionProgramingEx.Ex3;

public class Dog implements Comparable<Dog>{
    private final Integer size;

    public Dog(Integer size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "size=" + size +
                '}';
    }

    @Override
    public int compareTo(Dog o) {
       return this.size.compareTo(o.size);
    }
}
