package w1.genericsEx.Ex4;

import java.util.Arrays;

public class Ex4 {


    public static void main(String[] args) {
        String[] strings = new String[]{"a","b","c"};
        System.out.println(Arrays.toString(strings));
        changeElement(strings,0,2);
        System.out.println(Arrays.toString(strings));

    }

    static <T> boolean changeElement ( T[] array ,int indexStart, int indexEnd){
        if(indexStart == indexEnd ||
        indexStart < 0 ||
        indexEnd <0 ||
        indexStart >= array.length ||
        indexEnd >= array.length){
            return false;
        }

        T temp = array[indexStart];
        array[indexStart] = array[indexEnd];
        array[indexEnd] = temp;
        return true;

    }
}
