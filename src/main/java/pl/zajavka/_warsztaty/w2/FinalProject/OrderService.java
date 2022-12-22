package pl.zajavka._warsztaty.w2.FinalProject;
import java.util.Set;
public class OrderService {
    private static final Set<String> PAID_STATUSES
            = Set.of("0", "5", "12", "15", "18");
    private static final Set<String> SENT_STATUSES
            = Set.of("1", "2", "4", "7", "8", "11", "13", "16", "19", "21", "25");
    public static Purchase.Status checkOrderStatus(final Purchase purchase) {
        if (PAID_STATUSES.contains(purchase.getProduct().getId().replace("product", ""))) {
            return Purchase.Status.PAID;
        } else if (SENT_STATUSES.contains(purchase.getProduct().getId().replace("product", ""))) {
            return Purchase.Status.SENT;
        } else {
            return Purchase.Status.DONE;
        }
    }
}