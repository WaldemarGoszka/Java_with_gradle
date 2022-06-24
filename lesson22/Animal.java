package lesson22;

public interface Animal {
    public static String name = "";

    void sing();
    void run();
    default void live(){

    }
}
