package home;

import java.time.LocalDate;

public class Book {
    Long id;
    String BookName;
    String authorName;
    int price;
    String genre;
    LocalDate createData;

    public Book(Long id, String bookName, String authorName, int price, String genre, LocalDate createData) {
        this.id = id;
        this.BookName = bookName;
        this.authorName = authorName;
        this.price = price;
        this.genre = genre;
        this.createData = createData;
    }

    public String getInfo() {
        return "Book{" +
                "id : " + id +
                ", BookName : '" + BookName + '\'' +
                ", Author name : " + authorName +
                ", price : " + price +
                ", genre : '" + genre + '\'' +
                ", createData : " + createData +
                '}';
    }
}
