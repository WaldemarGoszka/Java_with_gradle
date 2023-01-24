package pl.zajavka._warsztaty.w10.strategy;

import java.util.ArrayList;
import java.util.List;

public class OnlineShop {
    private List<Parcel> parcels = new ArrayList<>();

    public void addParcel(Parcel parcel) {
        parcels.add(parcel);
    }

    public void deliver(DeliveryStrategy deliveryStrategy) {
        parcels.forEach(parcel -> deliveryStrategy.deliver(parcel));
    }

}
