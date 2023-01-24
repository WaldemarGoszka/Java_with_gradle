package pl.zajavka._warsztaty.w10.strategy;

public class PostStrategy implements DeliveryStrategy{
    @Override
    public void deliver(final Parcel parcel) {
        System.out.printf("Parcel %s delivered by Post%n", parcel);
    }

}
