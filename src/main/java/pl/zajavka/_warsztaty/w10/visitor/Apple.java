package pl.zajavka._warsztaty.w10.visitor;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
@Data
@AllArgsConstructor

public class Apple implements ShoppingCartElement{
    private BigDecimal pricePerKg;
    private BigDecimal weight;

    @Override
    public BigDecimal accept(final ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }

}
