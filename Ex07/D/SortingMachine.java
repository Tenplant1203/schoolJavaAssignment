import java.util.Arrays;

public class SortingMachine {
  public void sort(Relatable[] items) {
    // import java.util.Comparator;
    // Arrays.sort(points, Comparator
    // .comparing(Point::getX)
    // .thenComparing(Point::getY));

    Arrays.sort(items, (r1, r2) -> {
      if (r1.isSmallerThan(r2))
        return -1;
      else if (r2.isSmallerThan(r1))
        return 1;
      else
        return 0;
    });
  }
}
