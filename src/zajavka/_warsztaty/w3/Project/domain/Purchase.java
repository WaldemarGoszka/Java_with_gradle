package zajavka._warsztaty.w3.Project.domain;

import java.math.BigDecimal;
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
