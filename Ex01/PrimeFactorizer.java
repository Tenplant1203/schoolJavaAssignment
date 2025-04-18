import java.util.ArrayList;
import java.util.Scanner;

class PrimeFactorizer {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    scanner.close();
    int original = num;
    var list = new ArrayList<Integer>();

    for (int i = 2; i * i < num; i++) {
      if (num % i == 0) {
        while (num % i == 0) {
          list.add(i);
          num /= i;
        }
      }
    }

    if (num > 1)
      list.add(num);
    System.out.printf("%d:", original);
    for (int i = 0; i < list.size(); i++) {
      System.out.printf(" %d", list.get(i));
    }
    System.out.printf("\n");
  }
}
