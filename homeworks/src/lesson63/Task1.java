package lesson63;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Task1 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Введите количество книг: ");
    while (!scanner.hasNextInt()) {
      System.out.println("Некорректный ввод " + scanner.nextLine());
      System.out.print("Введите целое число: ");
    }
    int size = scanner.nextInt();
    scanner.nextLine();

    ArrayList<Book> books = new ArrayList<>(size);
    for (int i = 0; i < size; i++) {
      Book book = Book.interactiveRead(scanner);
      books.add(book);
    }

    System.out.println("Отсортируем книги по авторам: ");
    printBooksByAuthorOrTitle(books);
    printBooks(books);
  }

  /**
   * Сортировка книг по авторам, при совпадении - по названиям
   *
   * @param books список книг
   */
  private static void printBooksByAuthorOrTitle(ArrayList<Book> books) {
    books.sort(new Comparator<Book>() {
      @Override
      public int compare(Book o1, Book o2) {
        if (o1.getAuthor().compareTo(o2.getAuthor()) != 0) {
          return o1.getAuthor().compareTo(o2.getAuthor());
        }
        return o1.getTitle().compareTo(o2.getTitle());
      }
    });
  }

  /**
   * Нумерация списка книг
   *
   * @param books список книг
   */
  public static void printBooks(ArrayList<Book> books) {
    for (int i = 0; i < books.size(); i++) {
      System.out.println((i + 1) + ". " + books.get(i));
    }
  }
}
