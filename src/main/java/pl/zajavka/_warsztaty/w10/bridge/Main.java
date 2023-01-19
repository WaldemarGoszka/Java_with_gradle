package pl.zajavka._warsztaty.w10.bridge;

public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Square(new Red());
        System.out.println(shape1);

        Shape shape2 = new Triangle(new Green());
        System.out.println(shape2);

    }
}
