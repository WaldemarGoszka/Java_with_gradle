package Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LambdaExcesise {



    public static void main(String[] args) {
        LambdaInterface lambda1 = (a,b) -> a*b ;
        System.out.println(lambda1.run(5,5));
        Predicate<String> preStr  = (s) -> s.contains("sus");
        System.out.println(preStr.test("susu    sususu"));
        List<String> list = new ArrayList<>();
        list.add("gda");
        list.add("łisx");
        list.add("wars");
        list.removeIf( (String s) ->  s.contains("a")) ;
        LambdaInterface.run(10,11);

    }

}
