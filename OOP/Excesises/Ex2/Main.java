package OOP.Excesises.Ex2;

public class Main {
    public static void main(String[] args) {
        Function function1 = new HalfCalculator();
        Function function2 = new QuarterCalculator();
        System.out.println("Half Calculator 4 = " + function1.calculate(4));
        System.out.println("Quater calculation 12 =" + function2.calculate(12));
        FunctionClass functionClass = new HalfCalculator();
        System.out.println("FunctionClas half 10 : "+ functionClass.calculate(10));

        Function[] functions = new Function[10];
        for (int i = 0; i < functions.length; i++) {
            if(i % 2 == 0){
                functions[i] = new HalfCalculator();
            }
            functions[i] = new QuarterCalculator();
        }
        int count = 1234567;
        for (Function function : functions
        ){
            count += function.calculate(count);
        }
        System.out.println( "Result:" + count);

    }
}
