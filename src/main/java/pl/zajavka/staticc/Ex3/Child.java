package zajavka.staticc.Ex3;

public class Child extends AParent{
    @Override
    String getName(){
        return "Child getName";
    }

    static String getClassName(){
        return "Child getClassName";
    }
}
