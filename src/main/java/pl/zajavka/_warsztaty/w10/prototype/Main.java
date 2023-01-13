package pl.zajavka._warsztaty.w10.prototype;

public class Main {
    public static void main(String[] args) {
        CopyCar car = new CopyCar();
        SteeringWheel steeringWheel = new SteeringWheel();
        steeringWheel.setDiameter(21.5);
        car.setSteeringWheel(steeringWheel);

        CopyCar shallowCopied = car.shallowCopy();
        CopyCar deepCopied = car.deepCopy();

        System.out.println("shallowCopied == "
                + (car.steeringWheel == shallowCopied.steeringWheel));
        System.out.println("shallowCopied equals "
                + (car.steeringWheel.equals(shallowCopied.steeringWheel)));
        System.out.println("deepCopied == "
                + (car.steeringWheel == deepCopied.steeringWheel));
        System.out.println("deepCopied equals "
                + (car.steeringWheel.equals(deepCopied.steeringWheel)));

    }
}
