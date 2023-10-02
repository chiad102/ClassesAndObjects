package pro.sky.java.course1;

import java.util.Objects;

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

    @Override
    public String toString() {
        return name + " " + surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author author)) return false;
        return Objects.equals(getName(), author.getName()) && Objects.equals(getSurname(), author.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname());
    }
}
