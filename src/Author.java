public class Author {

    private final String name;
    private final String surname;

    @Override
    public String toString() {
        return name + " " + surname;
    }

    public Author(String authorName, String authorSurname){
        this.name = authorName;
        this.surname = authorSurname;
    }
    public String getAuthorName(){
        return name;
    }
    public String getAuthorSurname(){
        return surname;
    }
}
