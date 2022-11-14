package zajavka._warsztaty.w3;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class E15 {
    public static void main(String[] args) {
        System.out.println(Charset.defaultCharset());
        String sentence = "ae ąę";
        byte[] bytes = sentence.getBytes(StandardCharsets.UTF_8);
        System.out.println(Arrays.toString(bytes));
        String result = new String(bytes, StandardCharsets.UTF_8);
        System.out.println(result);
    }
}
