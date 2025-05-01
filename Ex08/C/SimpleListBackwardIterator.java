public class SimpleListBackwardIterator implements Iterator {
  private SimpleList simpleList;
  private SimpleNode cur;

  public SimpleListBackwardIterator(SimpleList list) {
    simpleList = list;
    cur = simpleList.getNil().getPrev();
  }

  public boolean hasNext() {
    return cur != simpleList.getNil();
  };

  public Object next() {
    SimpleNode target = cur;
    cur = cur.getPrev();
    return target;
  };

}
