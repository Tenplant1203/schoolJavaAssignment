public class Circle extends Shape {
  private Point center;
  private int radius;

  public Circle(Point center, int radius) {
    this.center = center;
    this.radius = radius;
  }

  @Override
  public void move(int dx, int dy) {
    center.move(dx, dy);
  }

  @Override
  public void print() {
    super.print();
    center.print();
    System.out.printf(" radius = %d\n", this.radius);
  }
}
