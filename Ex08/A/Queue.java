import java.util.ArrayDeque;
import java.util.Deque;

public class Queue implements OpenList {
  private Deque<Integer> queue;

  public Queue() {
    queue = new ArrayDeque<>();
  }

  @Override
  public void push(int value) {
    queue.addLast(value);
  }

  @Override
  public int pop() {
    return queue.removeFirst();
  }

  @Override
  public boolean isEmpty() {
    return queue.isEmpty();
  }
}
