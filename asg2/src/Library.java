import java.util.*;

public class Library{
    ArrayList<Book> books = new ArrayList<Book>();

    public void addBook(Book book){
        System.out.println("Book added to library: " + book.title);
        books.add(book);
    }

    public void borrowBook(Borrower borrower, Book book){
        borrower.borrowList.add(book);
        books.remove(book);
        System.out.println(borrower.borrowerName + "returned: " + book.title);
    }

    public void returnBook(Borrower borrower, Book book1) {
        borrower.borrowList.remove(book1);
        books.add(book1);
        System.out.println(borrower.borrowerName + "returned: " + book1.title);
    }

    public void displayLibraryBooks() {
        System.out.println("Books in library:");
        for (Book temp : books){
            System.out.println("Title: " + temp.title);
            System.out.println("ISBN: " + temp.isbn);
            System.out.println("Author: " + temp.author.name);
            System.out.println("Biography: " + temp.author.skills);
        }
    }

}