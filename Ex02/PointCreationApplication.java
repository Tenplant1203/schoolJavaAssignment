import java.util.Scanner;

class PointCreationApplication {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Point p1 = new Point();
    Point p2 = new Point();
    p1.setX(scanner.nextInt());
    p1.setY(scanner.nextInt());
    p2.setX(scanner.nextInt());
    p2.setY(scanner.nextInt());

    System.out.println("(" + p1.getX() + ", " + p1.getY() + ")");
    System.out.println("(" + p2.getX() + ", " + p2.getY() + ")");

    scanner.close();
  }
}
