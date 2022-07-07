package Exception;

public class Driver {
    int age;

    public Driver(int age) {
        this.age = age;
    }

    public void setAge(int age) {
        if (age < 18) {
//            throw new DrivingException("is not 18");
        }
        this.age = age;
    }
}
