package pl.zajavka._warsztaty.w10.strategy;

public class Main {
    public static void main(String[] args) {
        OnlineShop onlineShop = new OnlineShop();

        onlineShop.addParcel(new Parcel("skarpetki"));
        onlineShop.addParcel(new Parcel("monitory"));
        onlineShop.addParcel(new Parcel("samochody"));

        System.out.println("\n##CourierStrategy##");
        onlineShop.deliver(new CourierStrategy());

        System.out.println("\n##PostStrategy##");
        onlineShop.deliver(new PostStrategy());

        System.out.println("\n##ParcelLockerStrategy##");
        onlineShop.deliver(new ParcelLockerStrategy());


    }
}
