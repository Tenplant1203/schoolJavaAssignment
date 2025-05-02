public class StackImplByDeque implements Stack {
  private DequeImplByDLL stack;

  public StackImplByDeque() {
    this.stack = new DequeImplByDLL();
  }

  @Override
  public void push(int key) {
    stack.insertFront(key);
  };

  @Override
  public int pop() {
    int value = stack.front();
    stack.removeFront();
    return value;
  };

  @Override
  public int top() {
    return stack.front();
  };

  @Override
  public int size() {
    return stack.size();
  };

  @Override
  public boolean empty() {
    return stack.empty();
  };

}
