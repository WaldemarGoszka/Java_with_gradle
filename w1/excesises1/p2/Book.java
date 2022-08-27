package w1.excesises1.p2;

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
