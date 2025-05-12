public class DequeImplByDLL implements Deque {
  private final SimpleDoublyLinkedList list;
  private int n;

  public DequeImplByDLL() {
    this.list = new SimpleDoublyLinkedList();
    this.n = 0;
  }

  @Override
  public void insertFront(int key) {
    list.addFront(key);
    n++;
  }

  @Override
  public void insertBack(int key) {
    list.addBack(key);
    n++;
  }

  @Override
  public void removeFront() {
    if (n > 0) {
      list.removeFront();
      n--;
    }
  }

  @Override
  public void removeBack() {
    if (n > 0) {
      list.removeBack();
      n--;
    }
  }

  @Override
  public int front() {
    return list.front();
  }

  @Override
  public int back() {
    return list.back();
  }

  @Override
  public int size() {
    return n;
  }

  @Override
  public boolean empty() {
    return n == 0;
  }
}
