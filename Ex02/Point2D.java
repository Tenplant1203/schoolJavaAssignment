public class Point2D {
  private double x;
  private double y;

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

  public void add(Point2D point2d) {
    this.x += point2d.getX();
    this.y += point2d.getY();
  }

  public void scale(int magnification) {
    this.x *= magnification;
    this.y *= magnification;
  }

  public double length() {
    return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
  }

  public double dotProduct(Point2D point2d) {
    return this.x * point2d.getX() + this.y * point2d.getY();
  }

  public double crossProduct(Point2D point2d) {
    return this.x * point2d.getY() - this.y * point2d.getX();
  }
}
