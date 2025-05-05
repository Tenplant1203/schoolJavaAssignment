public class StackOverflowException extends Exception {
  private int value;

  public StackOverflowException(int value) {
    this.value = value;
  }

  @Override
  public String getMessage() {
    return "Overflow. " + value + " can not be pushed.";
  }
}
