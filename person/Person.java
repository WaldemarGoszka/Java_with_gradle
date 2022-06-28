package person;

abstract public class Person implements ConsumingMan {

    public final String name;
    public final String surname;

    public Person(String name, String surname){
        this.name = name;
        this.surname = surname;

    }
}
