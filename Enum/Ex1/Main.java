package Enum.Ex1;

public class Main {
    public static void main(String[] args) {

        for (Day day : Day.values()) {
            System.out.println(day + "(" +day.getShortName()+") Is working day?: "+ day.isWorkingDay()+ " Is Weekend?: "+ day.isWeekend());

        }
    }
}
