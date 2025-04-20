public class Point2D {
  private double x;
  private double y;

  public Point2D() {
    this.x = 0;
    this.y = 0;
  }

  public Point2D(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public void setX(double x) {
    this.x = x;
  }

  public void setY(double y) {
    this.y = y;
  }

  public double getX() {
    return this.x;
  }

  public double getY() {
    return this.y;
  }

  public double distance(Point2D point2d) {
    return Math.sqrt(Math.pow(this.x - point2d.getX(), 2) + Math.pow(this.y - point2d.getY(), 2));
  }

  @Override
  public String toString() {
    return String.format("(%.1f, %.1f)", this.x, this.y);
  }
}
