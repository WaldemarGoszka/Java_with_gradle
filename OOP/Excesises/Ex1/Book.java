package OOP.Excesises.Ex1;

public class Book {
    private int numberISBN;
    private String author;
    private String title;

    public Book(int numberISBN, String author, String title) {
        this.numberISBN = numberISBN;
        this.author = author;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
