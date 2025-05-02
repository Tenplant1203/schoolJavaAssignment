import java.util.ArrayDeque;

public class DequeImplByDLL implements Deque {
  private final java.util.Deque<Integer> deque;

  public DequeImplByDLL() {
    deque = new ArrayDeque<>();
  }

  public void insertFront(int key) {
    deque.addFirst(key);
  };

  public void insertBack(int key) {
    deque.addLast(key);
  };

  public void removeFront() {
    deque.removeFirst();
  };

  public void removeBack() {
    deque.removeLast();
  };

  public int front() {
    return deque.getFirst();
  };

  public int back() {
    return deque.getLast();
  };

  public int size() {
    return deque.size();
  };

  public boolean empty() {
    return deque.isEmpty();
  };

}
