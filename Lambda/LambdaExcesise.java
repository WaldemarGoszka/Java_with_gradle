package Lambda;

import java.util.function.Predicate;

public class LambdaExcesise {



    public static void main(String[] args) {
        LambdaInterface lambda1 = (a,b) -> a*b ;
        System.out.println(lambda1.run(5,5));
        Predicate<String> preStr  = (s) -> s.contains("sus");
        System.out.println(preStr.test("sususususu"));
    }
}
