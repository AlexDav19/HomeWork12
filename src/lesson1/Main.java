package lesson1;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Лев", "Толстой");
        Author author2 = new Author("Михаил", "Булгаков");
        Book book1 = new Book("Война и мир", author1, 1867);
        Book book2 = new Book("Мастер и Маргарита", author2, 1928);
        book2.setYear(1940);
        System.out.printf(" Книга \"%s\" написана в %s, автор: %s %s.%n", book2.getTitle(), book2.getYear(),
                book2.getAuthor().getFirsName(),book2.getAuthor().getLastName());
        System.out.printf(" Книга \"%s\" написана в %s, автор: %s %s.%n", book1.getTitle(), book1.getYear(),
                book1.getAuthor().getFirsName(),book1.getAuthor().getLastName());
    }
}