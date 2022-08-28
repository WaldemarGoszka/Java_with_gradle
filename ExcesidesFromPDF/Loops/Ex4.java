package ExcesidesFromPDF.Loops;

public class Ex4 {

    public static void main(String[] args) {
        some("","");

    }
    static void some(String... arg1) {
        System.out.println("varargs");
    }

    static void some(String arg1){
        System.out.println("some");
    }


}
