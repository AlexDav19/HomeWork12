package lesson1;

public class Author {
    private final String firsName;
    private final String lastName;

    public String getFirsName() {
        return this.firsName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public Author(String firsName, String lastName) {
        this.firsName = firsName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "автор: " + this.firsName + " " + this.lastName;
    }

    @Override
    public boolean equals(Object author) {
        if (this.getClass() != author.getClass()) {
            return false;
        } else {
            Author a1 = (Author) author;
            return firsName.equals(a1.firsName) && lastName.equals(a1.lastName);
        }
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(firsName, lastName);
    }
}
