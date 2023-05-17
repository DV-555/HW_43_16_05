import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    /*Задача 1.
    Создать класс Book (книга), в конструктор которого передавайте автора,
    название книги и количество страниц.
    Реализуйте интерфейс для сравнения книг: они должны сортироваться по авторам,
    а если авторы совпадают - по названиям (и там, и там - по алфавиту, "в словарном порядке").

    Задача 1.
    Используйте класс Book (книга) из предыдущего домашнего задания.
    Создайте компаратор, который позволит сортировать книги по названию,
    при одинаковых названиях - по автору (и там, и там - по алфавиту) */

    List<Book> books = new ArrayList<>();
    books.add(new Book("Author2", "Title5", 111));
    books.add(new Book("Author2", "Title2", 222));
    books.add(new Book("Author2", "Title3", 333));
    books.add(new Book("Author4", "Title4", 322));
    books.add(new Book("Author1", "Title1", 333));
    //System.out.println(books);
    Collections.sort(books, new BooksComparator());
    //books.sort(new BooksComparator());
    for (Book book : books) {
      System.out.println(book);
    }
  }
}



