package zajavka._warsztaty.w3.project;

import zajavka._warsztaty.w3.project.domain.Purchase;
import zajavka._warsztaty.w3.project.services.FileService;
import zajavka._warsztaty.w3.project.services.PurchaseMappingService;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
       Path path = Paths.get("./src/zajavka/_warsztaty/w3/project/resources/37 client-car-purchase-spreadsheet.csv");
        List<Purchase> purchases = FileService.loadData(path);
//        System.out.println(purchases);
        Map<String, List<Purchase>> purchaseGroupingByCompany = purchases.stream()
                .collect(Collectors.groupingBy(p -> p.getCar().getCompany()));
        for (Map.Entry<String, List<Purchase>> data : purchaseGroupingByCompany.entrySet()) {
            Path newPath = Paths.get("./src/zajavka/_warsztaty/w3/project/exported/ex2/purchses-of-"+data.getKey()+".csv");
            FileService.saveToFile(newPath, PurchaseMappingService.newLine(data.getValue()));
        }
    }
}
