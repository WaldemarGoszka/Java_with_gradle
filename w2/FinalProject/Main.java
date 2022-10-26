package w2.FinalProject;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Purchase> produce = DataFactory.produce();
        long quantityOfBuyer = produce.stream()
                .map(a -> a.getBuyer())
                .distinct()
                .count();
        System.out.println("1.1. Quantity of Buyers : " + quantityOfBuyer);
        long blikPayment = produce.stream()
                .filter(a -> Purchase.Payment.BLIK.equals(a.getPayment()))
                .map(a -> a.getBuyer())
                .distinct()
                .count();
        System.out.println("1.2. Quantity of BLIK payment: " + blikPayment );
        long clientsWhoCreditCardPayment = produce.stream().
                filter(a -> Purchase.Payment.BLIK.equals(a.getPayment()))
                .map(a -> a.getBuyer())
                .distinct()
                .count();
        System.out.println("1.3. Quantity of Clients who pay CreditCard: " +  clientsWhoCreditCardPayment);
        long eurPurchase = produce.stream()
                .map(a -> a.getProduct())
                .filter(a -> Money.Currency.EUR.equals(a.getPrice().getCurrency()))
                .count();
        System.out.println("1.4. Quantity of purchase in EUR: " + eurPurchase );
        produce.stream()
                .map(a -> a.getProduct())
                .distinct()
                .filter(a -> Money.Currency.EUR.equals(a.getPrice().getCurrency()))
                .count();
        System.out.println("5. Unique products in EUR: " + eurPurchase );
        //najlepiej aby kluczem nie była klasa a id z klasy w postacie String lub Integer dlatego stosujemy getID
        Map<String, BigDecimal> collect = produce.stream()
                .filter(p -> Money.Currency.PLN.equals(p.getProduct().getPrice().getCurrency()))
                .collect(Collectors.toMap(key -> key.getBuyer().getId(), v ->
                        BigDecimal.valueOf(v.getQuantity()).multiply(v.getProduct().getPrice().getValue()), (left, right) -> left.add(right)));
        System.out.println("2.1" + collect);
        System.out.println("2.2");

        System.out.println(quantityOfBuyInCategory(produce,Product.Category.CLOTHES));
        System.out.println(quantityOfBuyInCategory(produce,Product.Category.AUTOMOTIVE));
        System.out.println(quantityOfBuyInCategory(produce,Product.Category.HOBBY));
        System.out.println(quantityOfBuyInCategory(produce,Product.Category.GARDEN));

        long count23 = produce.stream().
                map(p -> new Purchase(p,OrderService.checkOrderStatus(p)))
                .filter(p -> p.getStatus().equals(Purchase.Status.DONE))
                .count();
        System.out.println("2.3: " + count23);
        var strifff = produce.stream()
                .map(p -> new Purchase(p, OrderService.checkOrderStatus(p)))
                .collect(Collectors.toMap(k -> k.getStatus(), v -> new ArrayList<>(List.of(v)), (l,r) -> {
                    l.addAll(r); return l;
                }));
        System.out.println("2.3 : " + strifff);
    }
    static Map<String, Long> quantityOfBuyInCategory(List<Purchase> list , Product.Category category){
        return list.stream()
                .filter(p -> category.equals(p.getProduct().getCategory()) && p.getQuantity() > 1)
                .collect(Collectors.toMap(key -> key.getBuyer().getId(), value -> value.getQuantity(),(Long left, Long right) -> left + right));

    }

}
