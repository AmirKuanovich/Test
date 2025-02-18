package home;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book(1L,"Игрок","Достоевский",290,"Роман", LocalDate.of(2023,3,22));
        Book book2 = new Book(2L,"Самурай без меча","Хидаеси",400,"Поучения", LocalDate.of(2018,4,12));
        Book book3 = new Book(3L,"Воин","Кимура",300,"Повесть", LocalDate.of(2016,5,9));
        Book book4 = new Book(4L,"Война и мир","Толстой",200,"Художественная литиратура", LocalDate.of(2012,4,11));
        Book book5 = new Book(5L,"Дон Кихот","Мигель",500,"Сатира", LocalDate.of(1605,8,27));

        Book[] books1 = {book1,book3,book4};
        Book[] books2 = {book1,book5,book2};
        Book[] books3 = {book2,book4,book3};

        Library library1 = new Library(1L, "Александрийская Библиотека", "Египет", books1);
        Library library2 = new Library(2L, "Британская библиотека", "Лондон", books2);
        Library library3 = new Library(3L, "Библиотека Конгресса ", "Вашенктон", books3);

        Library[] libraries = {library1,library2,library3};

        for (Library library : libraries){
            library.getBookId();
        }
    }
}
