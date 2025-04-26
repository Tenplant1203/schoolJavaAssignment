public class Rectangle extends Shape {
  private Point[] points;

  public Rectangle(Point p1, Point p2) {
    this.points = new Point[4];
    this.points[0] = p1;
    this.points[1] = new Point(p2.getX(), p1.getY());
    this.points[2] = p2;
    this.points[3] = new Point(p1.getX(), p2.getY());
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
