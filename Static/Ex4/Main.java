package Static.Ex4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        char[] chars = signsCreator(86, 24, 74, 22, 14,54,21,90,123);
        System.out.println(Arrays.toString(chars));

    }
    private static char[] signsCreator(int ... numbers){
        char[] result = new char[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            result[i] = (char)numbers[i];
        }
        return result;
    }
}
