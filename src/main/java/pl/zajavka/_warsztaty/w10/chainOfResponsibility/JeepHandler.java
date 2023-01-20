package pl.zajavka._warsztaty.w10.chainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

public class JeepHandler implements CarHandler{
    private CarHandler carHandler;

    @Override
    public void setNextHandler(final CarHandler nextHandler) {
        this.carHandler = nextHandler;
    }

    @Override
    public void handle(final Car car) {
        if (Car.Type.JEEP.equals(car.getType())) {
            System.out.println("Preparing Jeep Skeleton");
            final List<String> jeepEquipment = new ArrayList<>(car.getEquipment());
            jeepEquipment.add("Spare Wheel");
            this.carHandler.handle(car.withEquipment(jeepEquipment));
        } else {
            this.carHandler.handle(car);
        }
    }

}
