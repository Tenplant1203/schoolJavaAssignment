import java.util.Comparator;

public class XYComparator implements PointComparator {
  @Override
  public int compare(Point p1, Point p2) {
    return Comparator
        .comparingInt(Point::x)
        .thenComparingInt(Point::y)
        .compare(p1, p2);
  }
}
