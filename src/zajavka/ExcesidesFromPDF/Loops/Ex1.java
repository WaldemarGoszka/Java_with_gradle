package zajavka.ExcesidesFromPDF.Loops;

public class Ex1 {
    public static void main(String[] args) {
        int power = 7;
        int sum = 1;
        for (int i = 1; i <= power; i++) {
            sum *= i;
        }
        System.out.println("Power of "+power+" equals "+sum);
    }



}
