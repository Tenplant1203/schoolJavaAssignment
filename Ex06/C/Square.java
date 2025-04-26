public class Square extends Shape {
  private Point[] points;

  public Square(Point p1, int width) {
    this.points = new Point[4];
    this.points[0] = p1;
    this.points[1] = new Point(p1.getX() + width, p1.getY());
    this.points[2] = new Point(this.points[1].getX(), this.points[1].getY() + width);
    this.points[3] = new Point(this.points[0].getX(), this.points[2].getY());
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
