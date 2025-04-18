public class SimpleList {
  private SimpleNode nil;

  SimpleList() {
    init();
  }

  private void init() {
    nil = new SimpleNode();
    nil.setNext(nil);
    nil.setPrev(nil);
  }

  public SimpleNode listSearch(int key) {
    SimpleNode current = this.nil.getNext();

    while (current != this.nil) {
      if (current.getValue() == key) {
        return current;
      }
      current = current.getNext();
    }

    return null;
  }

  public void printList() {
    SimpleNode current = this.nil.getNext();
    var sb = new StringBuilder();

    while (current != this.nil) {
      sb.append(current.getValue());
      if (current.getNext() != this.nil) {
        sb.append(" ");
      }
      current = current.getNext();
    }
    System.out.println(sb.toString());
  }

  public void delete(int key) {
    SimpleNode deleteNode = listSearch(key);
    if (deleteNode == null || deleteNode == this.nil) {
      return;
    }
    SimpleNode prevNode = deleteNode.getPrev();
    SimpleNode nextNode = deleteNode.getNext();

    prevNode.setNext(nextNode);
    nextNode.setPrev(prevNode);
  }

  public void insert(int key) {
    SimpleNode head = this.nil.getNext();
    SimpleNode newNode = new SimpleNode(key);

    newNode.setPrev(this.nil);
    newNode.setNext(head);
    head.setPrev(newNode);
    this.nil.setNext(newNode);
  }
}
