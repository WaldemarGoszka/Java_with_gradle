package zajavka.ExcesidesFromPDF.Conditional;

public class Ex4 {

    public static void main(String[] args) {
    int giveMeNumberOfMonth = 33;
        switch(giveMeNumberOfMonth){
            case 1,3,5,7,8,10,12:
                System.out.println("31");
                break;
            case 2:
                System.out.println("28 or 29");
                break;
            case 4,6,9,11:
                System.out.println("30");
                break;
            default:
                System.out.println("Wrong number of month");

        }
    }
}
