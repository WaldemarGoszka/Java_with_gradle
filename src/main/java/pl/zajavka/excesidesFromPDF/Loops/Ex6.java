package zajavka.excesidesFromPDF.Loops;

public class Ex6 {
    public static void main(String[] args) {
    int loops = 9;
    int count = 0;
        for (int i = 39, j = 11; count < loops ; count++) {
            System.out.print(i+", "+j);
            if(count != loops-1){
                System.out.print(", ");
            }
            i+=2;
            j-=3;

        }
    }
}
