package zajavka.exception;


public class Main {
    public static void main(String[] args) {
//        String abc  = "123";
//        if(abc.equals("123")){
//            throw new MyException("nie to");
//        }else{
//            System.out.println("1234");
//        }
        System.out.println("one");
        try{
            System.out.println("two");
            throw new NullPointerException();
        } catch (NullPointerException e){
            System.out.println("three");
            throw new RuntimeException("four");
        } catch (RuntimeException e){
            System.out.println("five");
            throw new RuntimeException("six");
        } finally {
            System.out.println("seven");
            throw new RuntimeException("eight");
        }

}}

