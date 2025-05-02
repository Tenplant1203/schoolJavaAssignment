import java.util.ArrayDeque;

public class DequeImplByDLL implements Deque {
  private final java.util.Deque<Integer> deque;

  public DequeImplByDLL() {
    deque = new ArrayDeque<>();
  }

  @Override
  public void insertFront(int key) {
    deque.addFirst(key);
  };

  @Override
  public void insertBack(int key) {
    deque.addLast(key);
  };

  @Override
  public void removeFront() {
    deque.removeFirst();
  };

  @Override
  public void removeBack() {
    deque.removeLast();
  };

  @Override
  public int front() {
    return deque.getFirst();
  };

  @Override
  public int back() {
    return deque.getLast();
  };

  @Override
  public int size() {
    return deque.size();
  };

  @Override
  public boolean empty() {
    return deque.isEmpty();
  };

}
