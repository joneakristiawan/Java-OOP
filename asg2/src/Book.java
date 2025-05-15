public class Book{
    public Author author;
    public String title;
    public String isbn;
    
    public Book(String title, String isbn, Author author){
        this.title = title;
        this.isbn = isbn;
        this.author = author;
    }
}