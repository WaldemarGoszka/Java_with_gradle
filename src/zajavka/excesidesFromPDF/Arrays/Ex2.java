package zajavka.excesidesFromPDF.Arrays;

public class Ex2 {
    public static void main(String[] args) {
        String giveMePalingrom = "może jutro ta dama sama da tortu jeżom";
        String palindrom = giveMePalingrom.replace(" ","").toLowerCase();
        char[] arr = palindrom.toCharArray();
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]);
        }
    }
}
