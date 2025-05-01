public record Point(int x, int y) {
  public void print() {
    System.out.printf("(%d, %d)\n", x, y);
  }
}
