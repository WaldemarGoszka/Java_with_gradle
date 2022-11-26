package zajavka._warsztaty.w3.project.domain;

public class Person {

    private String name;
    private String surname;
    private String email;
    private String ipAddress;

    public Person(String name, String surname, String email, String ipAddress) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.ipAddress = ipAddress;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", ipAddress='" + ipAddress + '\'' +
                '}';
    }
}
