public class Point implements Relatable {
  private int x;
  private int y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public void print() {
    System.out.printf("(%d, %d)\n", x, y);
  }

  @Override
  public boolean isSmallerThan(Relatable other) {
    Point p = (Point) other;
    if (this.x != p.x) {
      return this.x < p.x;
    }
    return this.y < p.y;
  }

  public void move(int dx, int dy) {
    this.x += dx;
    this.y += dy;
  }
}
