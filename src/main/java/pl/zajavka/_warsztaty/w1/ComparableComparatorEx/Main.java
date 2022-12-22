package zajavka._warsztaty.w1.ComparableComparatorEx;

import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Bartek", "Kowalczyk",19, BigDecimal.valueOf(5450.23) ));
        employees.add(new Employee("Bartek", "Kowalczyk",19, BigDecimal.valueOf(3450.23) ));
        employees.add(new Employee("Bartek", "Kowalczyk",18, BigDecimal.valueOf(5450.23) ));
        employees.add(new Employee("Edward", "Dudnyj",43, BigDecimal.valueOf(32450.23) ));
        employees.add(new Employee("Rafał", "Kowalczyk",17, BigDecimal.valueOf(2450.23) ));
        employees.add(new Employee("Bartek", "Kowalczyk",45, BigDecimal.valueOf(4450.23) ));
        employees.add(new Employee("Ania", "Rubik",65, BigDecimal.valueOf(5450.23) ));
        employees.add(new Employee("Kamila", "Mojżeńczyk",44, BigDecimal.valueOf(21450.23) ));
        employees.add(new Employee("Agnieszka", "Klinkiewicz",34, BigDecimal.valueOf(5450.23) ));
        employees.add(new Employee("Kamila", "Kownacka",27, BigDecimal.valueOf(9450.23) ));
        employees.add(new Employee("Agnieszka", "Barysieńczyk",54, BigDecimal.valueOf(8450.23) ));

        print(employees);
        Collections.sort(employees);
        print(employees);
    }

    private static void print(List<Employee> employees) {
        System.out.println("--------------------------");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }
}
