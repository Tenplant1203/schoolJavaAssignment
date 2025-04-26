public class Quadrangle extends Shape {
  private Point[] points;

  public Quadrangle(Point p1, Point p2, Point p3, Point p4) {
    this.points = new Point[4];
    this.points[0] = p1;
    this.points[1] = p2;
    this.points[2] = p3;
    this.points[3] = p4;
  }

  @Override
  public void move(int dx, int dy) {
    for (Point point : this.points) {
      point.move(dx, dy);
    }
  }

  @Override
  public void print() {
    super.print();
    for (int i = 0; i < 4; i++) {
      points[i].print();
      if (i < 3)
        System.out.print("-");
    }
    System.out.println();
  }
}
