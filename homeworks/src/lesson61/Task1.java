package lesson61;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {

  // Найти минимальное четное число в последовательности положительных чисел
  // или вывести -1, если такого числа не существует
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();

    List<Integer> numbers = new ArrayList<>();

    for (int i = 0; i < size; i++) {
      int x = scanner.nextInt();
      if (x <= 0) {
        return;
      }
      if (x % 2 == 0) {
        numbers.add(x);
      }
    }
  }
}
