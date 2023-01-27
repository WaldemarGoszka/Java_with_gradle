package pl.zajavka._warsztaty.w10.visitor;

import java.math.BigDecimal;

public interface ShoppingCartElement {
    BigDecimal accept(ShoppingCartVisitor visitor);
}
