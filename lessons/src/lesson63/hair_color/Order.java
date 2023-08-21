package lesson63.hair_color;

import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Order {

  private static final double PRICE_PER_CM = 1.5; // евро за сантиметр длины
  private static final double MULTIPLIER_PER_COLOR = 0.2; // доля за каждый цвет
  private String name;         // имя заказчика
  private LocalTime startTime; // время начала
  private int colors;          // количество цветов
  private double length;       // длина волос
  private double price;        // сумма заказа

  public Order(String name, LocalTime startTime, int colors, double length) {
    this.name = name;
    this.startTime = startTime;
    this.colors = checkColors(colors);
    this.length = checkLength(length);
    calculatePrice();
  }

  public String getName() {
    return name;
  }

  public LocalTime getStartTime() {
    return startTime;
  }

  public int getColors() {
    return colors;
  }

  public double getLength() {
    return length;
  }

  public double getPrice() {
    return price;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setStartTime(LocalTime startTime) {
    this.startTime = startTime;
  }

  /**
   * Проверка длины на корректность
   *
   * @param colors исходное количество цветов для проверки
   * @return корректное количество цветов
   */
  private int checkColors(int colors) {
    if (colors < 0) {
      throw new IllegalArgumentException("Количество цветов не может быть отрицательным");
    }
    return colors;
  }

  public void setColors(int colors) {
    this.colors = checkColors(colors);
    calculatePrice();
  }

  /**
   * Проверка длины на корректность
   *
   * @param length исходная длина
   * @return корректная длина
   */
  private double checkLength(double length) {
    if (length < 0) {
      throw new IllegalArgumentException("Длина не может быть отрицательной");
    }
    return length;
  }

  public void setLength(double length) {
    this.length = checkLength(length);
    calculatePrice();
  }

  public void setPrice(double price) {
    this.price = price;
  }

  /**
   * обновление поля <code>price</code> с использованием значений <code>length</code> и
   * <code>colors</code>
   */
  private void calculatePrice() {
    price = PRICE_PER_CM * length + MULTIPLIER_PER_COLOR * colors;
  }

  /**
   * Интерактивное чтение данных о заказе
   *
   * @param scanner источник данных
   * @return прочитанный заказ
   * @throws java.time.format.DateTimeParseException при некорректном вводе времени начала
   */
  public static Order interactiveRead(Scanner scanner) {
    System.out.print("Введите имя заказчика: ");
    String name = scanner.nextLine();
    System.out.print("Введите время начала: ");
    LocalTime startTime;
    boolean startTimeRead = false;
    while (!startTimeRead) {
      String startTimeInput = scanner.nextLine();
      try {
        startTime = LocalTime.parse(scanner.nextLine());
        startTimeRead = true;
      } catch (DateTimeParseException e) {
        System.out.println("Некорректный ввод: " + startTimeInput);
        System.out.print("Введите время в формате НН:ММ: ");
      }
    }
    System.out.print("Укажите количество цветов: ");
    while (!scanner.hasNextInt()) {
      System.out.println("Некорректный ввод: " + scanner.nextLine());
      System.out.print("введите целое число: ");
    }
    int colors = scanner.nextInt();
    scanner.nextLine();
    System.out.print("Укажите длину волос в сантиметрах: ");
    while (!scanner.hasNextDouble()) {
      System.out.println("Некорректный ввод: " + scanner.nextLine());
      System.out.print("введите число: ");
    }
    double length = scanner.nextDouble();
    scanner.nextLine();
    return new Order(name, startTime, colors, length);
  }
}
