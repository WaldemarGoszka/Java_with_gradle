package w2;

public class Dog {
    String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        System.out.println("getName");
        return name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
