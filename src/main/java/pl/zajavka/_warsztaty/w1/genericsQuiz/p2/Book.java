package zajavka._warsztaty.w1.genericsQuiz.p2;

public class Book<AUTHOR> {
    AUTHOR author;

    public Book(AUTHOR author) {
        this.author = author;
    }

    public String get() {
        return author.toString();
    }

    public static void main(String[] args) {
        System.out.print(new Book("Prus").get());
        System.out.print(new Book<String>("Mickiewicz").get());
        System.out.print(new Book<>("Sienkiewicz").get());
    }
}
