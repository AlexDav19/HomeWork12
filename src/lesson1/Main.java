package lesson1;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Лев", "Толстой");
        Author author2 = new Author("Михаил", "Булгаков");
        Book book1 = new Book("Война и мир", author1, 1867);
        Book book2 = new Book("Мастер и Маргарита", author2, 1928);
        book2.setYear(1940);
        System.out.println(book2);
        System.out.println(book1);
        System.out.println(author1);
        System.out.println(author2);
        System.out.println(author1.equals(author2));
        System.out.println(book1.equals(book2));
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(author1.hashCode());
    }
}