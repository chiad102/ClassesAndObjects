package pro.sky.java.course1;

import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    private int date;

    public Book(String bookName, Author author, int date) {
        if (author == null) {
            throw new RuntimeException("Книга без автора существовать не может.");
        }
        this.name = bookName;
        this.author = author;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getDate() {
        return date;
    }

    public void setName(String bookName) {
        this.name = bookName;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Книга : " +
                "Название = '" + name + '\'' +
                ", Автор = " + author.toString() +
                ", Год = " + date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return getDate() == book.getDate() && Objects.equals(getName(), book.getName()) && Objects.equals(getAuthor(), book.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAuthor(), getDate());
    }
}
