package lesson23;

public interface Quiz impl Main{
     protected String  abc = "3";
     boolean ad;

    public Quiz(String abc) {
//        this();
        this.abc = abc;

    }
    public Quiz(String abc, int sd) {

        this.abc = abc;
//        this("ssds");

        }

    public void dds(){
        this("ss ");

    }

    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        System.out.println("adf" + quiz.abc + quiz.ad);
    }
}
