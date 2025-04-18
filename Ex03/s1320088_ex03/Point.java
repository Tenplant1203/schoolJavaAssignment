public class Point {
  public static int X_MIN;
  public static int X_MAX;
  public static int Y_MIN;
  public static int Y_MAX;

  private int x;
  private int y;

  Point() {
    this.x = 0;
    this.y = 0;
  }

  public int getX() {
    return this.x;
  }

  public int getY() {
    return this.y;
  }

  public void move(int dx, int dy) {
    if (this.x + dx < X_MIN || this.x + dx > X_MAX || this.y + dy < Y_MIN || this.y + dy > Y_MAX) {
      return;
    }
    this.x += dx;
    this.y += dy;
  }
}
