package pl.zajavka._warsztaty.w10.prototype.cloneable;

import lombok.SneakyThrows;

public class Main {
    @SneakyThrows
public static void main(String[] args) {
// załóżmy, że ta operacja jest kosztowna
    PrototypeCar prototypeCar = new PrototypeCar();
    System.out.println("original: " + prototypeCar);
    PrototypeCar cloned = prototypeCar.clone();
    System.out.println("cloned: " + cloned);

    System.out.println(prototypeCar.getSteeringWheel() == cloned.getSteeringWheel());
    System.out.println(prototypeCar.getBrand() == cloned.getBrand());
    System.out.println(prototypeCar.getModel() == cloned.getModel());
    System.out.println(prototypeCar.getDoors() == cloned.getDoors());

    System.out.println("before adding: " + cloned);
    cloned.getDoors().add("back door");

    System.out.println("after adding proto: " + prototypeCar);
    System.out.println("after adding cloned: " + cloned);
}

}
