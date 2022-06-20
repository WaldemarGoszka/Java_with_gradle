import java.util.Objects;

public class Flat extends Bulding {
    public int noOfRomms = 5;
    public String name  = "woronicza";

    public static void main(String[] args) {
        Flat flal = new Flat();

        System.out.println(flal.noOfRomms);
    }
    @Override
    public String toString() {
        return "Flat{" +
                "noOfRomms=" + noOfRomms +
                ", name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", number=" + number +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flat flat = (Flat) o;
        return noOfRomms == flat.noOfRomms && Objects.equals(name, flat.name);
    }

    @Override
    public int hashCode() {
        return noOfRomms;
    }
}
