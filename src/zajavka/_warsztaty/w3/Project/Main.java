package zajavka._warsztaty.w3.Project;

import zajavka._warsztaty.w3.Project.domain.Purchase;
import zajavka._warsztaty.w3.Project.services.FileService;
import zajavka._warsztaty.w3.Project.services.PurchaseMappingService;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
       Path path = Paths.get("./src/zajavka/_warsztaty/w3/Project/resources/37 client-car-purchase-spreadsheet.csv");
        List<Purchase> purchases = FileService.loadData(path);
        purchases.stream()
                .collect(Collectors.groupingBy());
    }
}
