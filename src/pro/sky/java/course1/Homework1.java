package pro.sky.java.course1;

public class Homework1 {
    public static void main(String[] args) {
        Author author = new Author("Dan", "Abbnet");
        Author author1 = new Author("Graham", "McNeill");
        Book book = new Book("Warpsword ", author, 1988);
        Book book1 = new Book("Dreamcatcher", new Author("Stephen", "King"), 2001); // теперь узнал что так можно
        book.setDate(1999);
        System.out.println(book);
        System.out.println("book1 = " + book1);

    }
}
