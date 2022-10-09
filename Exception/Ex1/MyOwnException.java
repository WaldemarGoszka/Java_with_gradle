package Exception.Ex1;

public class MyOwnException extends Exception{
    public MyOwnException(String message) {
        super(message);
    }

    public MyOwnException() {
        super("My Own Exception");
    }


}
