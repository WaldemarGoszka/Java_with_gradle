package pl.zajavka._warsztaty.w10.visitor;

import java.math.BigDecimal;

public interface ShoppingCartVisitor {
    BigDecimal visit(Apple apple);
    BigDecimal visit(Bicycle bicycle);

}
