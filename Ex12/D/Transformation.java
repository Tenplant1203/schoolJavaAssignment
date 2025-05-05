import java.util.Scanner;

public class Transformation {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
    StringBuilder sb = new StringBuilder(str);
    int q = Integer.parseInt(scanner.nextLine());

    for (int i = 0; i < q; i++) {
      String systemIn = scanner.nextLine();
      String[] tokens = systemIn.split(" ");

      String command = tokens[0];
      int a = Integer.parseInt(tokens[1]);
      int b = Integer.parseInt(tokens[2]);

      switch (command) {
        case "replace":
          sb.replace(a, b + 1, tokens[3]);
          break;
        case "reverse":
          String sub = sb.substring(a, b + 1);
          sub = new StringBuilder(sub).reverse().toString();
          sb.replace(a, b + 1, sub);
          break;
        case "print":
          System.out.println(sb.substring(a, b + 1));
          break;
      }
    }

    scanner.close();
  }
}
