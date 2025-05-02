public class QueueImplByDeque implements Queue {
  private DequeImplByDLL queue;

  public QueueImplByDeque() {
    queue = new DequeImplByDLL();
  }

  @Override
  public void enqueue(int key) {
    queue.insertFront(key);
  };

  @Override
  public int dequeue() {
    int value = queue.back();
    queue.removeBack();
    return value;
  };

  @Override
  public int front() {
    return queue.front();
  };

  @Override
  public int size() {
    return queue.size();
  };

  @Override
  public boolean empty() {
    return queue.empty();
  };

}
