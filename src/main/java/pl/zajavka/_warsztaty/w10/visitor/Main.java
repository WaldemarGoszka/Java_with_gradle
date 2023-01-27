package pl.zajavka._warsztaty.w10.visitor;

import java.math.BigDecimal;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ShoppingCartElement> elements = List.of(
                new Bicycle(BigDecimal.valueOf(100.25), BigDecimal.TEN),
                new Bicycle(BigDecimal.valueOf(420.99), BigDecimal.valueOf(10.20)),
                new Apple(BigDecimal.valueOf(9.80), BigDecimal.valueOf(2.34)),
                new Apple(BigDecimal.valueOf(9.80), BigDecimal.valueOf(6.12))
        );

        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();

        BigDecimal totalCost = elements.stream()
                .map(element -> element.accept(visitor))
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        System.out.println("Total shopping cart cost: " + totalCost);


    }
}
