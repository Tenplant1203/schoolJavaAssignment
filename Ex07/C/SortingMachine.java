import java.util.Arrays;
import java.util.Comparator;

public class SortingMachine {
  public void sort(Point[] points) {
    Arrays.sort(points, Comparator
        .comparing(Point::getX)
        .thenComparing(Point::getY));
  }
}
