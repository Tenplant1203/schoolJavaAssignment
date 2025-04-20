public class MovingPoint2D {
  private final Point2D point;
  private double vx;
  private double vy;

  public MovingPoint2D(double x, double y, double vx, double vy) {
    this.point = new Point2D(x, y);
    this.vx = vx;
    this.vy = vy;
  }

  public void move() {
    this.point.setX(this.point.getX() + this.vx);
    this.point.setY(this.point.getY() + this.vy);
  }

  public void setVelocity(double vx, double vy) {
    this.vx = vx;
    this.vy = vy;
  }

  public void setX(double x) {
    this.point.setX(x);
  }

  public void setY(double y) {
    this.point.setY(y);
  }

  public double getX() {
    return this.point.getX();
  }

  public double getY() {
    return this.point.getY();
  }

  public Point2D getPoint() {
    return this.point;
  }

  public double distance(MovingPoint2D point2d) {
    return this.point.distance(point2d.getPoint());
  }

  @Override
  public String toString() {
    return this.point.toString();
  }
}
