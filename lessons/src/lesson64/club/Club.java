package lesson64.club;

import java.util.ArrayList;

public class Club {

  public final String title;
  private final int capacity;
  private final int allowedAge;
  private final ArrayList<Vizitor> vizitors = new ArrayList<>();

  public Club(String title, int capacity, int allowedAge) {
    this.title = title;
    this.capacity = capacity;
    this.allowedAge = allowedAge;
  }

  public int getCapacity() {
    return capacity;
  }

  public int getAllowedAge() {
    return allowedAge;
  }

  public void greet() {
    System.out.println("Добро пожаловать в клуб \"" + title + "\"");
  }

  public boolean hasFreeSpace() {
    return vizitors.size() < capacity;
  }

  public void sorry() {
    System.out.println("Извините, мест больше нет");
  }

  public void tryToEnter(Vizitor vizitor) {
    if (vizitor.getAge() < allowedAge) {
      System.out.println("Извините, вам нельзя в клуб");
      return;
    }
    vizitors.add(vizitor);
  }

  public void printVizitorsByAge() {
    System.out.println("В клуб \"" + title + "\" сейчас " + vizitors.size() + "посетителей:");
    vizitors.stream()
        .sorted((o1, o2) -> {
          if (o1.getAge() != o2.getAge()) {
            return Integer.compare(o1.getAge(), o2.getAge());
          }
          return o1.getName().compareTo(o2.getName());
        })
        .forEach(vizitor -> System.out.println(vizitor));
  }

  public void close() {
    System.out.println("Клуб \"" + title + "\" закрывает свои двери до следующего раза");
  }
}
