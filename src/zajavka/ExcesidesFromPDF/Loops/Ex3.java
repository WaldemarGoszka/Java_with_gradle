package zajavka.ExcesidesFromPDF.Loops;

public class Ex3 {
    public static void main(String[] args) {
        char a = '#';
        int flor = 19;

        int z = 1;
        int start = 1;
        if (flor % 2 == 0) {
            start = 2;
            z = 0;
        }

        for (int i = 0; i < flor / 2 + z; i++) {
            for (int j = 0; j < flor / 2 - i; j++) {
                System.out.print(' ');
            }
            for (int k = 0; k < start + i * 2; k++) {
                System.out.print(a);
            }
            System.out.println();
        }


    }
}
