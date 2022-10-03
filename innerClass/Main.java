package innerClass;

import org.w3c.dom.ls.LSOutput;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
     private String  pstr = "zajavka";
    public static  void main(String[] args) {
        // inicjalizacja klasy wewnętrznej zwykłej, najpierw trzeba zainicjować klase gówną
        // a potem na referencji klase wewnętrzną
        BlockOfFlats blockOfFlats = new BlockOfFlats();
        BlockOfFlats.Flat flat = blockOfFlats.new Flat(BigDecimal.TEN);
        System.out.println(flat);
        //inicjalizacja klasy statycznej wewnętrznej
//        BlockOfFlats.Flat staticlass = new BlockOfFlats.StaticClass();
        Animal animal = () -> null;
        animal.run();
    }
    interface Animal{

        String run();
    }
    abstract  class Cat{
        public Cat() {
        }
    }


}
