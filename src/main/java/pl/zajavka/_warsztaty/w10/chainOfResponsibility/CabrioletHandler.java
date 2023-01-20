package pl.zajavka._warsztaty.w10.chainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

public class CabrioletHandler implements CarHandler{
    private CarHandler carHandler;

    @Override
    public void setNextHandler(final CarHandler nextHandler) {
        this.carHandler = nextHandler;
    }

    @Override
    public void handle(final Car car) {
        if (Car.Type.CABRIOLET.equals(car.getType())) {
            System.out.println("Preparing Cabriolet Skeleton");
            final List<String> cabrioletEquipment = new ArrayList<>(car.getEquipment());
            cabrioletEquipment.add("Cabriolet roof");
            this.carHandler.handle(car.withEquipment(cabrioletEquipment));
        } else {
            this.carHandler.handle(car);
        }
    }

}
