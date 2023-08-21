package lesson63.hair_color;

import java.time.LocalTime;

public class Order {

  private String name;         // имя заказчика
  private LocalTime startTime; // время начала
  private int colors;          // количество цветов
  private double length;       // длина волос
  private double price;        // сумма заказы

  public Order(String name, LocalTime startTime, int colors, double length) {
    this.name = name;
    this.startTime = startTime;
    this.colors = colors;
    this.length = length;
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

  public void setColors(int colors) {
    this.colors = colors;
  }

  public void setLength(double length) {
    this.length = length;
  }

  public void setPrice(double price) {
    this.price = price;
  }
}
