package zajavka.Exception.Ex1;

public class Main {
    public static void main(String[] args)  {
        try {
            extracted();
        } catch (MyOwnException e) {
            e.printStackTrace();
        }
    }

    private static void extracted() throws MyOwnException {

            throw new MyOwnException("some exception");

    }
}
