package ExcesidesFromPDF.Loops;

import javax.sound.midi.Soundbank;

public class Ex5 {
    public static void main(String[] args) {
//        System.out.println(5 % 3);
        for (int i = 0; i < 10000; i++) {
            boolean first = true;
            if(i<2){
                first = false;
                continue;
            }
            for (int j = 2; j <= Math.sqrt(i) ; j++) {
                if(i % j == 0){
                    first = false;
                    break;
                }

            }
            if(first){
                System.out.println(i);
            }

        }
    }

}
