package lesson63;

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
}
