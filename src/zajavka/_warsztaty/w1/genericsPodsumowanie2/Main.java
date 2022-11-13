package zajavka._warsztaty.w1.genericsPodsumowanie2;

public class Main{
    public static void main(String[] args) {
    Cyclist cyclist = new Cyclist();
    Bikeable<String> cyclist1 = new Cyclist();
    cyclist1.ride("Giant");
    cyclist.ride("Romet");
    }
}
