package zajavka.enumy;

public class interf {
    public static String sad = "a";

    static {
        sad += "s";
    }
    {

        sad += "n";
    }

    public static void main(String[] args) {
        System.out.println(interf.sad);
        System.out.println(interf.sad);
//        new interf().sad;

        System.out.println(interf.sad);
    }
}
