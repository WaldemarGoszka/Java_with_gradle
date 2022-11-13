package zajavka.ExcesidesFromPDF.Conditional;

public class Ex5 {
    public static void main(String[] args) {
        daysCounterFromMonth(12);
        daysCounterFromMonth(1);
        daysCounterFromMonth(55);
    }
    static public void daysCounterFromMonth(int month) {
        int sum = 0;
        switch (month) {
            case 12:
                sum += 31;
            case 11:
                sum += 30;
            case 10:
                sum += 31;
            case 9:
                sum += 30;
            case 8:
                sum += 31;
            case 7:
                sum += 31;
            case 6:
                sum += 30;
            case 5:
                sum += 31;
            case 4:
                sum += 30;
            case 3:
                sum += 31;
            case 2:
                sum += 28;
            case 1:
                sum += 31;
                break;
            default:
                sum = 0;


        }
        if (sum != 0){
            System.out.println("Days after " + month + " month is " + sum);
        } else {
            System.out.println("Wrong number of month");
        }
    }
}

