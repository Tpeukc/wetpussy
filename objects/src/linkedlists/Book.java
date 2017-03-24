package linkedlists;

/**
 * Created by YurievAP on 24.03.2017.
 */
public class Book {
    private String author;
    private String title;
    private int pages;

    public Book(String author, String title, int pages) {
        this.author = author;
        this.title = title;
        this.pages = pages;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() == this.getClass()) {
            Book book = (Book) obj;
            if ((book.author).equals(this.author) && (book.title).equals(this.title) && book.pages == this.pages) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = author != null ? author.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + pages;
        return result;
    }
}
