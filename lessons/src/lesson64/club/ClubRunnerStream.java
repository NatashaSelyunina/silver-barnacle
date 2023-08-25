package lesson64.club;

import java.util.Scanner;
import java.util.stream.Stream;

public class ClubRunnerStream {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Club club = new Club("Ромашка", 5, 18);
    club.greet();

    Stream.generate(() -> Vizitor.interactiveRead(scanner))
        .filter(vizitor -> vizitor.getAge() >= club.getAllowedAge())
        .limit(club.getCapacity())
        .sorted((v1, v2) -> Integer.compare(v1.getAge(), v2.getAge()))
        .forEach(vizitor -> System.out.println(vizitor));
    club.close();
  }
}
