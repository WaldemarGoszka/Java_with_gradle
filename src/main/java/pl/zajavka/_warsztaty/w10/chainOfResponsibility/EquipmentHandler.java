package pl.zajavka._warsztaty.w10.chainOfResponsibility;

import java.util.Objects;

public class EquipmentHandler implements CarHandler{
    private CarHandler carHandler;

    @Override
    public void setNextHandler(final CarHandler nextHandler) {
        this.carHandler = nextHandler;
    }

    @Override
    public void handle(final Car car) {
        if (Objects.nonNull(car.getEquipment())) {
            System.out.printf("Preparing equipment: %s%n", car.getEquipment());
        }
        this.carHandler.handle(car);
    }

}
