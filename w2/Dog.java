package w2;

public class Dog {
    String name;
    Owner owner;

    public Dog(String name) {
        this.name = name;
    }

    public Dog(Owner owner) {
        this.owner = owner;
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
