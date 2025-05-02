public class QueueImplByDeque implements Queue {
  private DequeImplByDLL queue;

  public QueueImplByDeque() {
    queue = new DequeImplByDLL();
  }

  public void enqueue(int key) {
    queue.insertFront(key);
  };

  public int dequeue() {
    int value = queue.back();
    queue.removeBack();
    return value;
  };

  public int front() {
    return queue.front();
  };

  public int size() {
    return queue.size();
  };

  public boolean empty() {
    return queue.empty();
  };

}
