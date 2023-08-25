package lesson64;

import java.util.Scanner;
import java.util.stream.Stream;

public class BookStream {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Введите количество книг: ");
    while (!scanner.hasNextInt()) {
      System.out.println("Некорректный ввод " + scanner.nextLine());
      System.out.print("Введите целое число: ");
    }
    int size = scanner.nextInt();
    scanner.nextLine();

    Stream.generate(() -> Book.interactiveRead(scanner))
        .limit(size)
        .sorted((book1, book2) -> {
          if (book1.getAuthor().compareTo(book2.getAuthor()) != 0) {
            return book1.getAuthor().compareTo(book2.getAuthor());
          }
          return book1.getTitle().compareTo(book2.getTitle());
        })
        .forEach(book -> System.out.println(book));
  }
}
