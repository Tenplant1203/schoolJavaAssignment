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

  public boolean isSmallerThan(Relatable other) {
    if (this.length() < other.length()) {
      return true;
    }
    return false;
  }

  public void print() {
    System.out.printf("(%d, %d)\n", x, y);
  }

  @Override
  public double length() {
    return Math.sqrt(x * x + y * y);
  }
}
