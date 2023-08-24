package lesson64.club;

import java.util.Scanner;

public class Vizitor {

  private final String name;
  private final int age;

  public Vizitor(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  @Override
  public String toString() {
    return "Vizitor{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }

  public static Vizitor interactiveRead(Scanner scanner) {
    System.out.println("Как вас зовут?");
    String name = scanner.nextLine();
    System.out.println("Сколько вам лет?");
    while (!scanner.hasNextInt()) {
      System.out.println("Некорректный ввод: " + scanner.nextLine());
      System.out.print("Введите целое число: ");
    }

    int age = scanner.nextInt();
    scanner.nextLine();

    return new Vizitor(name, age);
  }
}
