package pl.zajavka._warsztaty.w10.singleton;

public class StaticBlockSingleton {
    //implementaacja Eager - 
    private static final StaticBlockSingleton instance;

    static {
        // try na wszelki wypadek gdy wyskoczy jakiś błąd podczas tworzenia instancji
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred when creating instance");
        }
    }
//Prywatny konstruktor
    private StaticBlockSingleton() {
    }
// Statyczna metoda zwracająca instancję obiektu
    public static StaticBlockSingleton getInstance() {
        return instance;
    }

}
