package lesson61;

import java.util.Scanner;

public class Task1 {

  // Найти минимальное четное число в последовательности положительных чисел
  // или вывести -1, если такого числа не существует
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    for (int i = 0; i < size; i++) {
      int x = scanner.nextInt();
      if (x < 0) {
        return;
      }
    }
  }
}
