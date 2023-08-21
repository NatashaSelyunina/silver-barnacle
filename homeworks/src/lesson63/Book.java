package lesson63;

import java.util.Scanner;

public class Book {

  // Используйте класс Book из домашнего задания к уроку 53
  // но без интерфейса Comparable.
  // Создайте список книг и отсортируйте книги по автору,
  // (при одинаковых авторах - по названиям)
  // при помощи анонимного класса в качестве компаратора.
  private final String author;
  private final String title;
  private final int pages;

  public Book(String author, String title, int pages) {
    this.author = author;
    this.title = title;
    this.pages = pages;
  }

  public String getAuthor() {
    return author;
  }

  public String getTitle() {
    return title;
  }

  public int getPages() {
    return pages;
  }

  @Override
  public String toString() {
    return "Book{" +
        "author='" + author + '\'' +
        ", title='" + title + '\'' +
        ", pages=" + pages +
        '}';
  }

  /**
   * Интерактивное чтение данных о книге
   *
   * @param scanner источник данных
   * @return прочитанную книгу
   */
  public static Book interactiveRead(Scanner scanner) {
    System.out.print("Введите имя автора: ");
    String name = scanner.nextLine();
    System.out.print("Введите название книги: ");
    String title = scanner.nextLine();
    System.out.print("Введите количество страниц: ");
    while (!scanner.hasNextInt()) {
      System.out.println("Некорректный ввод " + scanner.nextLine());
      System.out.print("Введите целое число: ");
    }
    int pages = scanner.nextInt();
    scanner.nextLine();
    System.out.println();
    return new Book(name, title, pages);
  }
}
