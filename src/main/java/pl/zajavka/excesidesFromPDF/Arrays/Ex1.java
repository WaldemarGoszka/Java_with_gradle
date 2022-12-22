package zajavka.excesidesFromPDF.Arrays;

public class Ex1 {
    public static void main(String[] args) {
        String someSentenceForReserve = "Zajavka";
        for (int i = someSentenceForReserve.length()-1; i >= 0; i--) {
            System.out.print(someSentenceForReserve.charAt(i));

        }
        System.out.println("\nwith use arrays:");
        //with use arrays
        char[] arr = someSentenceForReserve.toCharArray();
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]);
        }

    }
}
