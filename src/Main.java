public class Main {



    public static void main(String[] args) {

        Author leoTolstoy = new Author("Leo", "Tolstoy");
        Author wilhelmHauff = new Author("Wilhelm", "Hauff");
        Author leoTolstoy2 = new Author("Leo", "Tolstoy");

        Book warAndPeace = new Book("War and peace", leoTolstoy, 1653);
        Book zwergNase = new Book("Der zwerg nase", wilhelmHauff, 1826);
        Book warAndPeace2 = new Book("War and peace", leoTolstoy, 1653);

        System.out.println(leoTolstoy.equals(leoTolstoy2));
        System.out.println(leoTolstoy.equals(wilhelmHauff));
        System.out.println(warAndPeace.equals(warAndPeace2));
        System.out.println(warAndPeace.equals(zwergNase));

        System.out.println(leoTolstoy);
        System.out.println(warAndPeace);

    }
}