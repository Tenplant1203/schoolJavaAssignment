public class Point {
  private int x;
  private int y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

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
    this.x += dx;
    this.y += dy;
  }

  public void print() {
    System.out.printf("(%d, %d)", this.x, this.y);
  }

  @Override
  public String toString() {
    return "(" + this.x + ", " + this.y + ")";
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null || getClass() != obj.getClass())
      return false;
    Point other = (Point) obj;
    return this.x == other.x && this.y == other.y;
  }
}
