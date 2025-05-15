import java.util.*;

public class Borrower {
    String borrowerName;
    ArrayList<Book> borrowList = new ArrayList<Book>();
    public Borrower(String string) {
        borrowerName = string;
    }
    public void displayBorrowedBooks() {
        System.out.println(borrowerName + "'s Borrowed Books:");
        for (Book temp : borrowList){
            System.out.println("Title: "+ temp.title);
            System.out.println("ISBN: "+ temp.isbn);
            System.out.println("Author: "+ temp.author.name);
            System.out.println("Biography: "+ temp.author.skills);
            System.out.println("-----------------------------");
        }
    }
    
}
