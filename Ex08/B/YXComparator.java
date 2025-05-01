import java.util.Comparator;

public class YXComparator implements PointComparator {
  @Override
  public int compare(Point p1, Point p2) {
    return Comparator
        .comparingInt(Point::y)
        .thenComparingInt(Point::x)
        .compare(p1, p2);
  }
}
