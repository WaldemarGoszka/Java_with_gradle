package zajavka.ExcesidesFromPDF.Loops;

import java.sql.SQLOutput;

public class Ex2 {
    public static void main(String[] args) {
        String giveMePalingrom = "może jutro ta dama sama da tortu jeżom";
        String palindrom = giveMePalingrom.replace(" ","").toLowerCase();

        for (int i = 0,j=palindrom.length()-1; i < palindrom.length(); i++,j--) {
            if(palindrom.charAt(i) == palindrom.charAt(j)){
                //System.out.print(palindrom.charAt(i)+"  "+ palindrom.charAt(j)+" |  ");
                continue;
            }else{
                System.out.println("Word is not a palindrom");
                return;
            }
        }
        System.out.println("Word is a palindrom");


    }
}
