import java.util.Scanner;

public class Ring {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String s = scanner.nextLine();
    String p = scanner.nextLine();
    String ringString = s + s;
    if (ringString.contains(p)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
    scanner.close();
  }
}
