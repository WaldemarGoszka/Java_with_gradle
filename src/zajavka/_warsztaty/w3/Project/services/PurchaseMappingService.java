package zajavka._warsztaty.w3.Project.services;

import zajavka._warsztaty.w3.Project.domain.Car;
import zajavka._warsztaty.w3.Project.domain.Location;
import zajavka._warsztaty.w3.Project.domain.Person;
import zajavka._warsztaty.w3.Project.domain.Purchase;

import java.math.BigDecimal;
import java.nio.file.Path;
import java.time.LocalDate;

public class PurchaseMappingService {
    public static Purchase newPurchase(String inputData){
        String[] row = inputData.split(",");
        Long id = Long.parseLong(row[0]);
        String name = row[1];
        String surname = row[2];
        String email = row[3];
        String ipAddress = row[4];
        String color = row[5];
        String vin = row[6];
        String company = row[7];
        String model = row[8];
        String modelYear = row[9];
        BigDecimal price = new BigDecimal(row[10].replace("\"","").substring(1));
        String country = row[11];
        String city = row[12];
        LocalDate date = LocalDate.parse(row[13]);
        return new Purchase(
                id,
                new Person(name,surname,email,ipAddress),
                new Car(color,vin,company,model,modelYear,price),
                new Location(country,city),
                date);
    }
}
