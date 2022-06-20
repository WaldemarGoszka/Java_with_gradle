public class Bulding {
    public String adress = "jp2";
    public int number = 4;

    public void print(){
        System.out.println("metoda print");
    }
    @Override
    public String toString() {
        return "Bulding{" +
                "adress='" + adress + '\'' +
                ", number=" + number +
                '}';
    }
}

