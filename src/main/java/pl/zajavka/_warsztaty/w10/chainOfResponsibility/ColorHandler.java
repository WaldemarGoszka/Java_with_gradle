package pl.zajavka._warsztaty.w10.chainOfResponsibility;

import java.util.Objects;

public class ColorHandler implements CarHandler{
    private CarHandler carHandler;

    @Override
    public void setNextHandler(final CarHandler nextHandler) {
        this.carHandler = nextHandler;
    }

    @Override
    public void handle(final Car car) {
        if (Objects.nonNull(car.getColor())) {
            System.out.printf("Preparing %s color%n", car.getColor());
        }
        this.carHandler.handle(car);
    }

}
