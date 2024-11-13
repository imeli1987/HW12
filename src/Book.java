public class Book {
    private final String bookName;
    private final Author author;
    private int publicYear;

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
