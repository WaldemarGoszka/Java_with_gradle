package pl.zajavka._warsztaty.w10.chainOfResponsibility;

public interface CarHandler {

        void setNextHandler(CarHandler nextHandler);

        void handle(Car car);


}
