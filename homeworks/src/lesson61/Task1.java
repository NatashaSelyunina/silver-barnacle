package lesson61;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {

  // Найти минимальное четное число в последовательности положительных чисел
  // или вывести -1, если такого числа не существует
  public static void main(String[] args) {                       // time = O(n)     // space = O(1)
    Scanner scanner = new Scanner(System.in);                    // O(1)            // O(1)
    int size = scanner.nextInt();                                // O(1)            // O(1)

    List<Integer> numbers = new ArrayList<>();                   // O(1)            // O(1)

    for (int i = 0; i < size; i++) {                             // O(n)            // +O(1)
      int x = scanner.nextInt();                                 // O(1)            // +O(1)
      if (x <= 0) {
        System.out.println("Число должно быть больше 0!");       // O(1)            // O(1)
        return;
      }
      if (x % 2 == 0) {
        numbers.add(x);                                          // O(1)            // O(1)
      }
    }

    if (numbers.size() == 0) {
      System.out.println(-1);                                    // O(1)            // O(1)
      return;
    }

    int min = numbers.get(0);                                    // O(1)            // O(1)
    for (int i = 1; i < numbers.size(); i++) {                   // O(n)            // +O(1)
      if (numbers.get(i) < min) {
        min = numbers.get(i);                                    // O(1)            // +O(1)
      }
    }
    System.out.println(min);                                     // O(1)            // O(1)
  }
}
