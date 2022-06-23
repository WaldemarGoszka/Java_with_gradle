package lesson22;

public class Cat implements Animal{

    @Override
    public void sing() {
        System.out.println("Cat sing");
    }

    @Override
    public void run() {
        System.out.println("Cat run");
    }
}
