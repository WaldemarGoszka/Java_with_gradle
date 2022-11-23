package zajavka._warsztaty.w3.Project.services;

import zajavka._warsztaty.w3.Project.domain.Purchase;

import java.math.BigDecimal;

public class PurchaseMappingService {
    public static Purchase newPurchase(String inputData){
        String[] row = inputData.split(",");
        Long id = Long.parseLong(row[0]);
        return new Purchase(row[0],);
    }
}
