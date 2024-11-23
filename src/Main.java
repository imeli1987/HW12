public class Main {
    public static void main(String[] args) {

        Author leoTolstoy = new Author("Leo", "Tolstoy");
        Author wilhelmHauff = new Author("Wilhelm", "Hauff");

        Book warAndPeace = new Book("War and peace", leoTolstoy, 1653);
        Book zwergNase = new Book("Der zwerg nase", wilhelmHauff, 1826);

        System.out.println(warAndPeace.getBookName());
        System.out.println(warAndPeace.getAuthorName());
        System.out.println(leoTolstoy.getAuthorName() + " " + leoTolstoy.getAuthorSurname());
        System.out.println(warAndPeace.getPublicYear());
        warAndPeace.setPublicYear(2003);
        System.out.println(warAndPeace.getPublicYear());

        System.out.println(zwergNase.getBookName());
        System.out.println(zwergNase.getAuthorName());
        System.out.println(wilhelmHauff.getAuthorName() + " " + wilhelmHauff.getAuthorSurname());
        System.out.println(zwergNase.getPublicYear());
        zwergNase.setPublicYear(1827);
        System.out.println(zwergNase.getPublicYear());

    }
}