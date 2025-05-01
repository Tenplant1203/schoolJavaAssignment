public class SimpleList implements Aggregate {
  private SimpleNode nil;

  public SimpleList() {
    nil = new SimpleNode(-1);
    nil.setNext(nil);
    nil.setPrev(nil);
  }

  public SimpleNode getNil() {
    return nil;
  }

  public void insert(int key) {
    SimpleNode node = new SimpleNode(key);
    node.setNext(nil.getNext());
    node.setPrev(nil);
    nil.getNext().setPrev(node);
    nil.setNext(node);
  }

  public void delete(int key) {
    SimpleNode cur = nil.getNext();
    while (cur != nil) {
      if (cur.getKey() == key) {
        cur.getPrev().setNext(cur.getNext());
        cur.getNext().setPrev(cur.getPrev());
        return;
      }
      cur = cur.getNext();
    }
  }

  @Override
  public Iterator forwardIterator() {
    return new SimpleListForwardIterator(this);
  }

  @Override
  public Iterator backwardIterator() {
    return new SimpleListBackwardIterator(this);
  }
}
