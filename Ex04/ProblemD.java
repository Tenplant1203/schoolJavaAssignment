import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class ProblemD {
  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    int numLanes = scanner.nextInt();
    int numOperations = scanner.nextInt();

    var gasStation = new GasStation(numLanes);

    for (int i = 0; i < numOperations; i++) {
      int operation = scanner.nextInt();

      if (operation == 1) {
        int car = scanner.nextInt();
        gasStation.addCar(car);
      } else if (operation == 0) {
        int laneNumber = scanner.nextInt();
        System.out.println(gasStation.finishRefueling(laneNumber));
      }
    }

    scanner.close();
  }
}

class GasStation {
  private final List<Deque<Integer>> lanes;

  public GasStation(int numLanes) {
    lanes = new ArrayList<>(numLanes);
    for (int i = 0; i < numLanes; i++) {
      lanes.add(new ArrayDeque<>());
    }
  }

  public void addCar(int carNumber) {
    int targetLaneIndex = 0;
    int minSize = Integer.MAX_VALUE;
    for (int i = 0; i < lanes.size(); i++) {
      int laneSize = lanes.get(i).size();
      if (laneSize < minSize) {
        minSize = laneSize;
        targetLaneIndex = i;
      }
    }
    lanes.get(targetLaneIndex).addLast(carNumber);
  }

  public int finishRefueling(int laneNumber) {
    return lanes.get(laneNumber - 1).pollFirst();
  }
}
