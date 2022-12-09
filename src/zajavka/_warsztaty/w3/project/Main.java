package zajavka._warsztaty.w3.project;

import zajavka._warsztaty.w3.project.domain.Purchase;
import zajavka._warsztaty.w3.project.services.FileService;
import zajavka._warsztaty.w3.project.services.PurchaseMappingService;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //Read from file csv to  List object of Purchases
        Path path = Paths.get("./src/zajavka/_warsztaty/w3/project/resources/37 client-car-purchase-spreadsheet.csv");
        List<Purchase> purchases = FileService.loadData(path);
//        System.out.println(purchases);

        //Create Map and grouping by Car company to
        Map<String, List<Purchase>> purchaseGroupingByCompany = purchases.stream()
                .collect(Collectors.groupingBy(p -> p.getCar().getCompany()));

        //Iterate for Map and write each Purchase to file which grouping by Car company
        for (Map.Entry<String, List<Purchase>> entry : purchaseGroupingByCompany.entrySet()) {
            // Create name of file form name of key
            Path newPath = Paths.get("./src/zajavka/_warsztaty/w3/project/exported/ex2/purchses-of-" + entry.getKey() + ".csv");
            //Create List of row like List of String from object Purchase
            List<String> data = entry.getValue().stream().map(p -> PurchaseMappingService.toCsvRow(p)).toList();
            FileService.saveToFile(newPath, data);
        }


        //FileService.printSizeOfFiles(Paths.get("./src/zajavka/_warsztaty/w3/project/exported/ex2/"));

        try {
            TreeMap<Path, ? extends Number> mapSizeByCompany = Files.list(Paths.get("./src/zajavka/_warsztaty/w3/project/exported/ex2/"))
                    .collect(Collectors.toMap(
                            Path::getFileName,
                            path1 -> {
                                try {
                                    return Files.size(path1);
                                } catch (IOException e) {
                                    e.printStackTrace();
                                    return 0;
                                }
                            }, (a, b) -> a,
                            TreeMap::new));
            for (Path path1 : mapSizeByCompany.keySet()) {
                
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
//        try {
//             Files.list(Paths.get("./src/zajavka/_warsztaty/w3/project/exported/ex2/"))
//                    .collect(Collectors.toMap((Path p) -> p.getFileName()),
//                            path1 -> {
//                                try {
//                                    return Files.size(path1);
//                                } catch (IOException e) {
//                                    e.printStackTrace();
//                                    return 0;
//                                }
//                            }, (a, b) -> a, new TreeMap<>(Comparator.reverseOrder())));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

//
//        for (Map.Entry<Path, Long> pathLongEntry : listOfFiles.entrySet()) {
//            System.out.println("Company: " +
//                    pathLongEntry.getKey().toString()
//                            .replace("purchses-of-", "").
//                            replace(".csv", "") + " size: " + pathLongEntry.getValue());
//        }
    }
}
