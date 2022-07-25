package zad1x25;

public class Book {
    public int isbn;
    public String author;

    public Book(int isbn, String author) {
        this.isbn = isbn;
        this.author = author;
    }

    public static void main(String[] args) {

        Book[] Tab = new Book[3];
//        Book book1 = new Book(1234,"Ogniem i Mieczem");
        Tab[0] = new Book(1234,"Ogniem i Mieczem");
//        Book book2 =
        Tab[1] = new Book(2345, "Pan Tadeusz");
//        Book book3 = new Book(23454, "Pan Tadeusz2");
        Tab[2] = new Book(23454, "Pan Tadeusz2");

        int j = 0;
        for (int i = 0; i < Tab.length; i++) {
            if (Tab[i].author.charAt(0) == 'P') {
                j++;
            }
        }
        System.out.println(j);
        Book[] TabH = new Book[j];
        for (Book book : TabH
             ) {

        }
    }
}

