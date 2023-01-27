package pl.zajavka._warsztaty.w10.visitor;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
@Data
@AllArgsConstructor

public class Bicycle implements ShoppingCartElement{
    private BigDecimal price;
    private BigDecimal discount;

    @Override
    public BigDecimal accept(final ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }

}
