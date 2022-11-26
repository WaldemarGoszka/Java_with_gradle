package zajavka.staticc.Ex5;

public class AnotherChild implements IParent{
    @Override
    public String getName() {
//        return IParent.super.getName();
        return "getName from AnotherChild";
    }
    static String getClassName(){
        return "AnotherChild";
    }
}
