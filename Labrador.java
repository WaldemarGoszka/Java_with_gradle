public class Labrador extends Dog {
    public Labrador() {
        super(5);
        System.out.println("Labrador created" + Labrador.class);

    }

    @Override
    public String toString() {
        return "Labrador{}";
    }
}
