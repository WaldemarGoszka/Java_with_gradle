package zajavka._warsztaty.w3.Project;

import zajavka._warsztaty.w3.Project.services.FileService;
import zajavka._warsztaty.w3.Project.services.PurchaseMappingService;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
       Path path = Paths.get("./src/zajavka/_warsztaty/w3/Project/resources/37 client-car-purchase-spreadsheet.csv");
        FileService.loadData(path);
    }
}
