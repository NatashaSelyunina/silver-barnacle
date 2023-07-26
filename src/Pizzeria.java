import java.util.Scanner;

public class Pizzeria {

  // MVP: minimum viable product - минимально жизнеспособный продукт.
  // Продукт, который можно использовать для демонстрации идеи.
  // Написать небольшую программу, используемую для обработки заказов в пиццерии.
  // Команды:
  // - начать заказ
  //   - указать данные о пицце (на любом этапе можжно вернуться к предыдущему шагу)
  //      - название (а лучше выбор из списка)
  //      - размер (выбор из списка)
  //   - автоматический расчет стоимости
  //   - данные о заказе добавляются в файл (передаются на кухню) (заказ завершен)
  // - выход

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    MenuCommand command = MenuCommand.readCommand(scanner);
    switch (command) {
      case START:
        Pizza pizza = Pizza.readData(scanner);
        System.out.println("Делаем заказ");
        // начать заказ
        break;
      case UNEXPECTED://
        System.out.println("Некорректная команда");
        break;
      case EXIT:
        return; // завершение работы метода main()
    }
  }
}
