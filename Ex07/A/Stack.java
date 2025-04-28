public class Stack implements Container {
  private int[] data;
  private int capacity;
  private int top;

  public Stack(int capacity) {
    this.capacity = capacity - 1;
    data = new int[capacity];
    top = -1;
  }

  public void push(int value) {
    if (isFull()) {
      throw new RuntimeException();
    }
    data[++top] = value;
  }

  public int pop() {
    if (isEmpty()) {
      throw new RuntimeException();
    }
    return data[top--];
  }

  @Override
  public int size() {
    return top + 1;
  }

  @Override
  public boolean isFull() {
    return top == capacity;
  }

  @Override
  public boolean isEmpty() {
    return top == -1;
  }
}
