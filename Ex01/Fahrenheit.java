import java.util.Scanner;

public class Fahrenheit {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int fahrenheit = scanner.nextInt();
    scanner.close();
    double celsius = (5.0 / 9) * (fahrenheit - 32);
    celsius = Math.round(celsius * 10000.0) / 10000.0;
    System.out.println(celsius);
  }
}
