public class StackUnderflowException extends Exception {
  @Override
  public String getMessage() {
    return "Underflow. There is no element in the stack.";
  }
}
