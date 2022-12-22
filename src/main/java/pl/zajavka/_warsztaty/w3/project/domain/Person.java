package zajavka._warsztaty.w3.project.domain;

public class Person {

    private String firstName;
    private String lastName;
    private String email;
    private String ipAddress;

    public Person(String name, String surname, String email, String ipAddress) {
        this.firstName = name;
        this.lastName = surname;
        this.email = email;
        this.ipAddress = ipAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + firstName + '\'' +
                ", surname='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", ipAddress='" + ipAddress + '\'' +
                '}';
    }
}
