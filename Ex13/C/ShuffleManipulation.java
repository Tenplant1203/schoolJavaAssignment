import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class ShuffleManipulation extends ArrayManipulation {
  public ShuffleManipulation(ArrayOperation arrayOperation) {
    super(arrayOperation);
  }

  public int[] operate(int[] array) {
    int[] result = arrayOperation.operate(array);
    List<Integer> list = new ArrayList<>();
    for (int num : result)
      list.add(num);
    Collections.shuffle(list);
    for (int i = 0; i < result.length; i++)
      result[i] = list.get(i);
    return result;
  }
}
