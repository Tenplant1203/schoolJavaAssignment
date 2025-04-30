public class Point implements Relatable {
  private final int x;
  private final int y;

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

  @Override
  public boolean isSmallerThan(Relatable other) {
    Point p = (Point) other;
    if (this.x != p.x) {
      return this.x < p.x;
    }
    return this.x < p.y;
  }
}
