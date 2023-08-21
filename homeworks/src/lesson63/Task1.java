package lesson63;

import java.util.ArrayList;
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
  }
}
