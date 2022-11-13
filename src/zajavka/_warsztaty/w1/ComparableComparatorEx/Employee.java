package zajavka._warsztaty.w1.ComparableComparatorEx;

import java.math.BigDecimal;

public class Employee implements Comparable<Employee>{
    private String firstName;
    private String lastName;
    private Integer age;
    private BigDecimal salary;

    public Employee(String firstName, String lastName, Integer age, BigDecimal salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        int result = this.firstName.compareTo(o.firstName);
        if(result == 0){
            result = this.lastName.compareTo(o.lastName);
            if(result == 0) {
                result = this.age.compareTo(o.age);
                if (result == 0) {
                    result = this.salary.compareTo(o.salary);
                }
            }
       }
        return result;
    }
}
