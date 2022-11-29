package zajavka._warsztaty.w3.project.services;

import zajavka._warsztaty.w3.project.domain.Car;
import zajavka._warsztaty.w3.project.domain.Location;
import zajavka._warsztaty.w3.project.domain.Person;
import zajavka._warsztaty.w3.project.domain.Purchase;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

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

    public static String> newLine(Purchase purchase) {
        String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s",
                purchase.getId(),
                purchase.getPerson().getFirstName(),
                purchase.getPerson().getLastName(),
                purchase.getPerson().getEmail(),
                purchase.getIp_address(),
                purchase.getColor(),
                purchase.getCar_vin(),
                purchase.getCar_company(),
                purchase.getCar_model(),
                purchase.getCar_model_year(),
                purchase.getCar_price(),
                purchase.getCountry(),
                purchase.getCity(),
                purchase.getDate)();
    }
}
