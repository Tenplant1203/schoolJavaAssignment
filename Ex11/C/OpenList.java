public interface OpenList {
  public void push(int value) throws StackOverflowException;

  public int pop() throws StackUnderflowException;

  public boolean isEmpty();
}
