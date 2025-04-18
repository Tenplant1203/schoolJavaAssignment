public class MovingPoint2D extends Point2D {
  private double vx;
  private double vy;

  public MovingPoint2D(double x, double y, double vx, double vy) {
    setX(x);
    setY(y);
    this.vx = vx;
    this.vy = vy;
  }

  public void move() {
    setX(getX() + this.vx);
    setY(getY() + this.vy);
  }

  public void setVelocity(double vx, double vy) {
    this.vx = vx;
    this.vy = vy;
  }
}
