import java.util.ArrayDeque;
import java.util.Deque;
// import java.util.ArrayList;
// import java.util.List;

public class Stack {
  private Deque<Integer> deque = new ArrayDeque<>();
  // private List<Integer> list = new ArrayList<>();

  public void push(int x) {
    deque.addLast(x);
    // list.addLast(x);
  }

  public int pop() {
    return deque.removeLast();
    // return list.removeLast();
  }
}
