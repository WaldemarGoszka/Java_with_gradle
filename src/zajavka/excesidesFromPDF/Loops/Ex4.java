package zajavka.excesidesFromPDF.Loops;

public class Ex4 {

    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 6 == 0) {
                if(i != 0)
                System.out.println(i + " brown");
            }
            if (i % 6 == 1) {
                System.out.println(i + " red");
            }
            if (i % 6 == 2) {
                System.out.println(i + " green");
            }
            if (i % 6 == 3) {
                System.out.println(i + " blue");
            }
            if (i % 6 == 4) {
                System.out.println(i + " black");
            }
            if (i % 6 == 5) {
                System.out.println(i + " yellow");
            }
        }
    }

}
