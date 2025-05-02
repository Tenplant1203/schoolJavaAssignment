package template;

public abstract class BinaryTreeTraverser {
  public abstract void initialize();

  public abstract void finalize();

  public void performPre(BinaryTreeNode u) {
  }

  public void performIn(BinaryTreeNode u) {
  }

  public void performPost(BinaryTreeNode u) {
  }

  public void run(BinaryTreeNode s) {
    initialize();
    parse(s);
    finalize();
  }

  private void parse(BinaryTreeNode u) {
    if (u == null)
      return;
    performPre(u);
    parse(u.getLeftChild());
    performIn(u);
    parse(u.getRightChild());
    performPost(u);
  }
}
