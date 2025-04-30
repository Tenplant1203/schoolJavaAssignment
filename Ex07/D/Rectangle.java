public class Rectangle implements Relatable {
  private Point[] points;

  public Rectangle(Point p1, Point p2) {
    this.points = new Point[4];
    this.points[0] = p1;
    this.points[1] = new Point(p2.getX(), p1.getY());
    this.points[2] = p2;
    this.points[3] = new Point(p1.getX(), p2.getY());
  }

  public void move(int dx, int dy) {
    for (Point point : this.points) {
      point.move(dx, dy);
    }
  }

  public void print() {
    for (int i = 0; i < 4; i++) {
      points[i].print();
      if (i < 3)
        System.out.print("-");
    }
    System.out.println();
  }

  public int getArea() {
    return (points[1].getX() - points[0].getX()) * (points[2].getY() - points[1].getY());
  }

  @Override
  public boolean isSmallerThan(Relatable other) {
    Rectangle r = (Rectangle) other;
    return this.getArea() < r.getArea();
  }
}
