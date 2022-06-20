import java.beans.IntrospectionException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        Animal animal = new Animal();
        System.out.println(animal);
        Bulding building = new Bulding();
        System.out.println(building);
        Flat flat = new Flat();
        System.out.println(flat);
        System.out.println("---");
        accept(new Flat());
        method();
    }
public static void accept(Bulding obj){
        obj.print();
}
final static String method (){
        return null;
}

}
