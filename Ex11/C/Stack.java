import java.util.ArrayDeque;
import java.util.Deque;

public class Stack implements OpenList {
  private Deque<Integer> stack;
  private final int capacity;

  public Stack(int capacity) {
    this.stack = new ArrayDeque<>();
    this.capacity = capacity;
  }

  @Override
  public void push(int value) throws StackOverflowException {
    if (stack.size() >= capacity) {
      throw new StackOverflowException(value);
    }
    stack.addFirst(value);
  }

  @Override
  public int pop() throws StackUnderflowException {
    if (isEmpty()) {
      throw new StackUnderflowException();
    }
    return stack.removeFirst();
  }

  @Override
  public boolean isEmpty() {
    return stack.isEmpty();
  }
}
