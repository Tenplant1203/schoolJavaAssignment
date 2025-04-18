public class SimpleNode {
  private int value;
  private SimpleNode next;
  private SimpleNode prev;

  SimpleNode() {
    this.value = 0;
  }

  SimpleNode(int value) {
    this.value = value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public void setNext(SimpleNode node) {
    this.next = node;
  }

  public void setPrev(SimpleNode node) {
    this.prev = node;
  }

  public int getValue() {
    return this.value;
  }

  public SimpleNode getNext() {
    return this.next;
  }

  public SimpleNode getPrev() {
    return this.prev;
  }
}
