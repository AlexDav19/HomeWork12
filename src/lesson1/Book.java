package lesson1;

public class Book {
    private final String title;
    private final Author author;
    private int year;

    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Book(String title, Author author, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }

    public String toString() {
        return "Книга \"" + this.getTitle() + "\" написана в " + this.getYear() + " " + this.getAuthor().toString();
    }

    public boolean equals(Object book) {
        if (this.getClass() != book.getClass()) {
            return false;
        } else {
            Book b1 = (Book) book;
            return title.equals(b1.title) && author.equals(b1.author);
        }
    }

    /* Почему нельзя использовать такой код? Даже если у разных объектов будет одинаковый параметр title выдает false.
    public boolean equals(Book book) {
        return title.equals(book.title);
    }*/

    @Override
    public int hashCode() {
        return java.util.Objects.hash(title, author);
    }
}