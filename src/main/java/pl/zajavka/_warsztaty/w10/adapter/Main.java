package pl.zajavka._warsztaty.w10.adapter;

public class Main {
    public static void main(String[] args) {
        Dimension dimension = new SonyTV();
        DimensionAdapter dimensionAdapter = new DimensionAdapterImpl(dimension);
        System.out.println("original: " + dimension.getDimension());
        System.out.println("adapted: " + dimensionAdapter.getDimension());

    }
}
