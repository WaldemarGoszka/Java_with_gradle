package pl.zajavka._warsztaty.w10.singleton;

public class Main {
    public static void main(String[] args) {
        StaticBlockSingleton instance = StaticBlockSingleton.getInstance();
        LazyInitializationSingleton instance2 = LazyInitializationSingleton.getInstance();

    }
}
