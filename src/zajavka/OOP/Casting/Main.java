package zajavka.OOP.Casting;



public class Main {
    public static void main(String[] args) {
        Animal animal = new Cat(); // do zmiennej typu bazowego (superclass) przypisujemy obiekt typu dziedziczączego (subclass)
//        Cat cat = animal; // nie zgadzają się typy referencji
        Cat cat = (Cat) animal; // tak jak castowanie na byte to int jeśli chcemy zawęzić referencję animal do typu Cat


        animal.animalMethod();
        ((Cat) animal).catMethod(); // tu java sama dodaje casting gdy chcemy użyć metody z tupu Cat na referencji Animal(superclass)
        //czyli przez casting musimy powiedzieć javie że Cat jest subclasą Animala bo klasa Animal nie wie jakie klasy po niej dziedziczą
        // Natomiast klasa Cat wie źe dziedziczy z animal bo to zapisujeny jako extend

        cat.catMethod();
        cat.animalMethod(); // t castowanie już zaszło wczesniej w linijce 9

        Cat cat1 = new Cat();
        cat1.animalMethod(); // tu nie musimy już castować bo clasa Cat dziedziczy metody z Animala
        Animal animal1 = cat1; // w tą stronę nuie musimy castować (polimorfizm)

        Dog dog = (Dog) animal; // tu wystąpi błąd ClassCastException gdyż animal jest Cat() i nie można castować na Dog


    }
}
