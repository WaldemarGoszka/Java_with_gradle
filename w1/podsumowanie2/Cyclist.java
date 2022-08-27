package w1.podsumowanie2;

public class Cyclist implements Bikeable<String> {
    @Override
    public void ride(String vehicle) {
        System.out.println("name of vehicle: " + vehicle);
    }
}
