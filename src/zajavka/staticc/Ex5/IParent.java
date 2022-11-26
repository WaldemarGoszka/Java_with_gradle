package zajavka.staticc.Ex5;

public interface IParent {
    static String getClassName(){
        return "IParent";
    }
    default String getName(){
        return "getName from IParent";
    }


}
