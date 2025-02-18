package home;

import java.util.Arrays;

public class Library {
    Long id;
    String name;
    String address;
    Book[] books;

    public Library(Long id, String name, String address, Book[] books) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.books = books;
    }

    @Override
    public String toString() {
        return "Library{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", books=" + Arrays.toString(books) +
                '}';
    }

    public void getBookId() {
        if (id == 1) {
            System.out.println("Book : " + name + " -> ");
            for (Book book : books) {
                System.out.println(book.getInfo());
            }
        }
    }
}
