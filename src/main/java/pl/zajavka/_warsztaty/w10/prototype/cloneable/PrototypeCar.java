package pl.zajavka._warsztaty.w10.prototype.cloneable;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Data
public class PrototypeCar implements Cloneable{
    private String brand;
    private String model;
    private SteeringWheel steeringWheel;
    private List<String> doors;

    public PrototypeCar() {
        this.brand = "Ford";
        this.model = "Mustang";
        this.steeringWheel = SteeringWheel.of(12.34);
// załóżmy, że tworzenie drzwi jest bardzo kosztowne czasowo
        this.doors = new ArrayList<>(
                Arrays.asList("left front", "right front", "left rear", "right rear"));
    }

    // deep copy implementation

//    @Override
//    protected PrototypeCar clone() throws CloneNotSupportedException {
//        final PrototypeCar clone = (PrototypeCar) super.clone();
//        clone.brand = this.brand;
//        clone.model = this.model;
//        clone.steeringWheel = this.steeringWheel.clone();
//        clone.doors = new ArrayList<>(this.doors);
//         return clone;
//    }

    //shallow copy implementation
    @Override
    protected PrototypeCar clone() throws CloneNotSupportedException {
        return (PrototypeCar) super.clone();
    }
}
