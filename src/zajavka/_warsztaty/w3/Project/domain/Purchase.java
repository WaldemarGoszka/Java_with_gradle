package zajavka._warsztaty.w3.Project.domain;

import java.math.BigDecimal;
import java.time.LocalDate;


public class Purchase {
    private BigDecimal id;
    private Person person;
    private Car car;
    private Location location;
    private LocalDate date;

    public Purchase(BigDecimal id, Person person, Car car, Location location, LocalDate date) {
        this.id = id;
        this.person = person;
        this.car = car;
        this.location = location;
        this.date = date;
    }
}
