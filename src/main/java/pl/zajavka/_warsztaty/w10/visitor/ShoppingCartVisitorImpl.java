package pl.zajavka._warsztaty.w10.visitor;

import java.math.BigDecimal;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor{
    @Override
    public BigDecimal visit(final Apple apple) {
        BigDecimal totalCost = apple.getWeight().multiply(apple.getPricePerKg());
        System.out.println("Calculated Apple cost: " + totalCost);
        return totalCost;
    }

    @Override
    public BigDecimal visit(final Bicycle bicycle) {
        BigDecimal totalCost = bicycle.getPrice().subtract(bicycle.getDiscount());
        System.out.println("Calculated Bicycle cost: " + totalCost);
        return totalCost;
    }

}
