package lesson63.functional;

public class Functional {

  // Функциональные интерфейсы - интерфейсы с единственным абстрактным методом
  // (интерфейс для одной функции).
  // Разновидности функциональных интерфейсов - на самом деле определяются разновидностями
  // функций, которые они описывают:
  // - Runnable - ничего не получает и ничего не возвращает   - void method()        - запускаемое
  // - Supplier - ничего не получает, что-нибудь возвращает   - V method()           - поставщик
  // - Consumer - что-нибудь получает и ничего не возвращает  - void method(T arg)   - потребитель
  // - Function - что-нибудь получает и что-нибудь возвращает - V method(A arg)      - функция
  // - Predicate - что-нибудь получает и возвращает boolean - boolean method(A arg)  - предикат
  // Предикаты обычно используюстся для проверки условий (чаще всего это фильтрация)
}
