import java.util.ArrayDeque;
import java.util.Deque;

public class Stack implements OpenList {
  private Deque<Integer> stack;

  public Stack() {
    stack = new ArrayDeque<>();
  }

  @Override
  public void push(int value) {
    stack.addFirst(value);
  }

  @Override
  public int pop() {
    return stack.removeFirst();
  }

  @Override
  public boolean isEmpty() {
    return stack.isEmpty();
  }
}
