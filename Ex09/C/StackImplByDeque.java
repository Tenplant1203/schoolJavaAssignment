public class StackImplByDeque implements Stack {
  private DequeImplByDLL stack;

  public StackImplByDeque() {
    this.stack = new DequeImplByDLL();
  }

  public void push(int key) {
    stack.insertFront(key);
  };

  public int pop() {
    int value = stack.front();
    stack.removeFront();
    return value;
  };

  public int top() {
    return stack.front();
  };

  public int size() {
    return stack.size();
  };

  public boolean empty() {
    return stack.empty();
  };

}
