public class Book {
    private final String bookName;
    private final Author authorName;
    private int publicYear;

    public Book(String bookName, Author authorName, int publicYear){
        this.authorName = authorName;
        this.publicYear = publicYear;
        this.bookName = bookName;
    }

    public String getBookName(){
        return bookName;
    }
    public Author getAuthorName(){
        return authorName;
    }
    public int getPublicYear(){
        return publicYear;
    }
    public void setPublicYear(int publicYear){
        this.publicYear = publicYear;
    }

}
