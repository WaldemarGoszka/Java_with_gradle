package pl.zajavka._warsztaty.w10.prototype.cloneable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
public class SteeringWheel {
    private double diameter;

}
