package pro.sky.java.course1;

public class Author {
    String name;
    String surname;

    public Author(String name, String surname) {
        if (name.isEmpty() || surname.isEmpty()) {
            throw new RuntimeException("Книга без автора существовать не может.");
        }
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
