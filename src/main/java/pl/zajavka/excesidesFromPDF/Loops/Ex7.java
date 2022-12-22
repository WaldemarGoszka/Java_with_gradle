package zajavka.excesidesFromPDF.Loops;

public class Ex7 {
    public static void main(String[] args) {
        int fiboLenght =20;
        int x1=0;
        int x2=1;
        System.out.println(x1+", ");
        System.out.println(x2+", ");
        for (int i = 0; i < fiboLenght; i++) {
            int temp = x1 + x2;
            System.out.println(temp+", ");
            x1 = x2;
            x2= temp;
        }
    }
}
