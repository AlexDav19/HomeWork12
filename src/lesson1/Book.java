package lesson1;

public class Book {
    private String title;
    private Author author;
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
}
