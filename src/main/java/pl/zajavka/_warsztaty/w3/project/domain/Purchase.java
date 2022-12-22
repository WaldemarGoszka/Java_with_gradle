package zajavka._warsztaty.w3.project.domain;

import java.time.LocalDate;


public class Purchase {
    private Long id;
    private Person person;
    private Car car;
    private Location location;
    private LocalDate date;

    public Purchase(Long id, Person person, Car car, Location location, LocalDate date) {
        this.id = id;
        this.person = person;
        this.car = car;
        this.location = location;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public Person getPerson() {
        return person;
    }

    public Car getCar() {
        return car;
    }

    public Location getLocation() {
        return location;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "id=" + id +
                ", person=" + person +
                ", car=" + car +
                ", location=" + location +
                ", date=" + date +
                '}';
    }
}
