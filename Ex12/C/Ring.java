public class Ring {
  public static void main(String[] args) {
    String ringString = args[0] + args[0];
    if (ringString.contains(args[1])) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
