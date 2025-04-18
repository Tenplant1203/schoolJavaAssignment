public class Point {
  private int x;
  private int y;

  public void setX(int x) {
    this.x = x;
  }

  public void setY(int y) {
    this.y = y;
  }

  public int getX() {
    return this.x;
  }

  public int getY() {
    return this.y;
  }

  public void move(int dx, int dy) {
    if (Math.abs(this.x + dx) > 100 || Math.abs(this.y + dy) > 100) {
      return;
    }
    this.x += dx;
    this.y += dy;
  }
}
