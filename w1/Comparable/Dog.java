package w1.Comparable;

public class Dog implements Comparable<Dog>{
    private Integer id;
    private String name;


    public Dog(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog: " + name + "_"+ id ;
    }

    @Override
    public int compareTo(Dog o) {
        int result = this.name.compareTo(o.name);
        if(result !=0){
            return result;
        }
        return this.id - o.id;
    }
}
