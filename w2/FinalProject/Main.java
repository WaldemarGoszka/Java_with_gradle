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
        System.out.println("2.2 ");

        System.out.println(quantityOfBuyInCategory(produce,Product.Category.CLOTHES));
        System.out.println(quantityOfBuyInCategory(produce,Product.Category.AUTOMOTIVE));
        System.out.println(quantityOfBuyInCategory(produce,Product.Category.HOBBY));
        System.out.println(quantityOfBuyInCategory(produce,Product.Category.GARDEN));

        long countOrderDone = produce.stream().
                map(p -> new Purchase(p,OrderService.checkOrderStatus(p)))
                .filter(p -> p.getStatus().equals(Purchase.Status.DONE))
                .count();
        System.out.println("2.3 Order Done : " + countOrderDone);
        var mapOrderStatus = produce.stream()
                .map(p -> new Purchase(p, OrderService.checkOrderStatus(p)))
                .collect(Collectors.toMap(k -> k.getStatus(), v -> new ArrayList<>(List.of(v)), (l,r) -> {
                    l.addAll(r); return l;
                }));
        System.out.println("2.3 Map Status: " + mapOrderStatus);

        var UniquePurchasesEUR = produce.stream()
                .filter(p -> Money.Currency.EUR.equals(p.getProduct().getPrice().getCurrency()))
                .collect(Collectors.toList());
        Map<String, List<Purchase>> collect1 = UniquePurchasesEUR.stream().collect(Collectors.groupingBy(k -> k.getBuyer().getId()));


        var countUniqueBuyerEUR = UniquePurchasesEUR.stream().map(p -> p.getBuyer())
                .distinct()
                .count();

        System.out.println("2.4: " + countUniqueBuyerEUR + " * " + collect1);

        Map<String, List<Product>> collect2 = produce.stream().
                collect(Collectors.groupingBy(k -> k.getBuyer().getPesel().toString().substring(0, 2),
                        TreeMap::new,Collectors.mapping(p -> p.getProduct(),Collectors.toList())));


        System.out.println("2.5: "+ collect2);



    }
    static Map<String, Long> quantityOfBuyInCategory(List<Purchase> list , Product.Category category){
        return list.stream()
                .filter(p -> category.equals(p.getProduct().getCategory()) && p.getQuantity() > 1)
                .collect(Collectors.toMap(key -> key.getBuyer().getId(), value -> value.getQuantity(),(Long left, Long right) -> left + right));

    }

}
