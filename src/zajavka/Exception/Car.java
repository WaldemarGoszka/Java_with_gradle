package zajavka.Exception;

public class Car {
    public Car() {
    }
    public static void drive(){
        try {
            System.out.println("static");
        } catch (OutOfMemoryError e){

        }
    }
    public void drivenon(){
        System.out.println("non static");
    }
}
