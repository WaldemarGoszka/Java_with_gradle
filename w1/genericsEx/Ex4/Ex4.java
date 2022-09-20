package w1.genericsEx.Ex4;

import java.util.Arrays;

public class Ex4 {


    public static void main(String[] args) {
        String[] strings = new String[]{"a","b","c"};
        System.out.println(Arrays.toString(strings));
        changeElement(strings,0,2);
        System.out.println(Arrays.toString(strings));

    }

    static <T> void changeElement ( T[] ts ,int a, int b){
        T temp = ts[a];
        ts[a] = ts[b];
        ts[b] = temp;


    }
}
