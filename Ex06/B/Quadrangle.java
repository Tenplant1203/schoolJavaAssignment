class Quadrangle extends Shape {
  protected Point[] P;

  public Quadrangle(Point p1, Point p2, Point p3, Point p4) {
    P = new Point[4];
    P[0] = p1;
    P[1] = p2;
    P[2] = p3;
    P[3] = p4;
  }

  public void print() {
    super.print();
    for (int i = 0; i < 4; i++) {
      System.out.print(P[i]);
      if (i < 3) {
        System.out.print("-");
      }
    }
    System.out.println();
  }

  public void move(int dx, int dy) {
    for (Point point : P) {
      point.move(dx, dy);
    }
  }
}
