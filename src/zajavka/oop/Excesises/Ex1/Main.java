package zajavka.oop.Excesises.Ex1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[2];
        Book book1 = new Book(1234455667, "Mickiewicz", "Pam Tadeusz");
        Book book2 = new Book(1234455473, "Shekspres", "Hamlet");
        books[0] = book1;
        books[1] = book2;


        int count = 0;
        for (Book book :
                books) {
            if(book.getTitle().charAt(0) == 'H'){
                count++;
            }
        }
        System.out.println("lenght of array count" + count);

        Book[] booksH = new Book[count];
        for (int i = 0, j = 0; i < books.length; i++) {
            if('H' == (books[i].getTitle().charAt(0))){
                booksH[j] = books[i];
                j++;
            }

        }
        System.out.println(Arrays.toString(books));
        System.out.println(Arrays.toString(booksH));


    }
}
