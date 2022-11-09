public interface Interface1 extends Interface2, Interface3{
    public static final String a = "a";

    void stMethod();

    default void method(){
        System.out.println("default");
    }
    default void method2(){
        System.out.println("default2");
    }

}
