import java.util.List;
import java.util.ArrayList;

public class Recomendation implements Prototype {
    private List<Book> books;
    private String targetAudience;

    public Recomendation() {
        this.books = new ArrayList<Book>();
        this.targetAudience = "";
    }

    public List<Book> getBooks() {
        return books;
    }

    public String getTargetAudience() {
        return targetAudience;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void setTargetAudience(String targetAudience) {
        this.targetAudience = targetAudience;
    }

    public Recomendation clone() {
        Recomendation rec = new Recomendation();
        rec.setTargetAudience(this.targetAudience);
        
        List<Book> books = new ArrayList<Book>();
        for (Book book : this.books) {
            books.add(book.clone());
        }
        
        rec.setBooks(books);
        return rec;
    }

    public String toString() {
        return "Target Audience: " + this.targetAudience + ", Books: " + this.books;
    }
}
