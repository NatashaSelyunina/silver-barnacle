package lesson62;

import java.util.Scanner;

public class Task1 {

  // Напишите рекурсивный метод public static String reverse(int x),
  // который будет возвращать строку, содержащую десятичные цифры числа
  // в обратном порядке (развернёт число).
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
  }

  public static String reverse(int x) {
    if (x < 10) {
      return Integer.toString(x);
    }
    return Integer.toString(Integer.parseInt((x % 10) + reverse(x / 10)));
  }
}

