import java.util.Objects;

public class Author {

    private final String name;
    private final String surname;

    @Override
    public String toString() {
        return "Автор{" +
                "имя='" + name + '\'' +
                ", фамилия='" + surname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(surname, author.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
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
