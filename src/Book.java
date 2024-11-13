import java.util.Objects;

public class Book {
    private final String bookName;
    private final Author author;
    private int publicYear;

    @Override
    public String toString() {
        return "Книга{" +
                "название книги='" + bookName + '\'' +
                ", автор=" + author +
                ", дата публикации=" + publicYear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, author);
    }

    public Book(String bookName, Author authorName, int publicYear){
        this.author = authorName;
        this.publicYear = publicYear;
        this.bookName = bookName;
    }

    public String getBookName(){
        return bookName;
    }
    public Author getAuthorName(){
        return author;
    }
    public int getPublicYear(){
        return publicYear;
    }
    public void setPublicYear(int publicYear){
        this.publicYear = publicYear;
    }

}
