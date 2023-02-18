package pl.zajavka._warsztaty.w4.exercises.avg;

import java.util.ArrayList;
import java.util.List;

public class Mainavg {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(5);
        array.add(7);
        array.add(8);
        System.out.println("Średnia : " + avg(array));

    }
        public static double avg(List<Integer> arrays){
            double sum = 0;
                for (int number:  arrays ) {
                sum += number;

                }
            return sum/arrays.size();
        }


}
