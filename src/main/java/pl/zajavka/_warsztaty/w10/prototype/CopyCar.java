package pl.zajavka._warsztaty.w10.prototype;

import lombok.Data;

@Data
public class CopyCar {
    SteeringWheel steeringWheel;

    public CopyCar shallowCopy() {
        var newCar = new CopyCar();
        newCar.steeringWheel = this.steeringWheel;
        // skopiowaniw tylko referencji do steringwhell i zwrócenie obiektu wraz z taką samą referencją
        return newCar;
    }

    public CopyCar deepCopy() {
        var newCar = new CopyCar();
        newCar.steeringWheel = this.steeringWheel.deepCopy();
        // kopiowanie oddzielnego obiektu steringwhell poprzez zwrócenie go z metody deepCopy()
        return newCar;
    }

}
