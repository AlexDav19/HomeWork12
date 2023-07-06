package lesson1;

public class Author {
    private String firsName;
    private String lastName;

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
}
