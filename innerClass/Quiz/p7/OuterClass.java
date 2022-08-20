package innerClass.Quiz.p7;

public class OuterClass {
    class InnerClass{

    }

    public static void main(String[] args) {
//        InnerClass in = new InnerClass();
//        InnerClass in = OuterClass.new InnerClass();
//        OuterClass.InnerClass in = new OuterClass.InnerClass();
//        OuterClass.InnerClass in = new OuterClass().InnerClass();
//        OuterClass.InnerClass in = new OuterClass.new InnerClass();
        OuterClass.InnerClass in = new OuterClass().new InnerClass();
//        OuterClass.InnerClass in = OuterClass(). new InnerClass();

    }
}
