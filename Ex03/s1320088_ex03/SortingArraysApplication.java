import java.util.Arrays;

class SortingArraysApplication {
  public static void main(String[] args) {
    new SortingArraysApplication().run();
  }

  void run() {
    int[][] arrays = {
        { 3, 2, 1 },
        { 9, 7, 10, 4, 8, 2, 5, 3, 1, 6 },
        { 7, 2, 3, 2, 2, 1, 1, 1 },
        { 2, 1 },
        { 100 },
        { 888888888, -888888888 }
    };
    for (int t = 0; t < arrays.length; t++)
      sort(arrays[t]);
    for (int i = 0; i < arrays.length; i++) {
      for (int j = 0; j < arrays[i].length; j++) {
        System.out.print(" " + arrays[i][j]);
      }
      System.out.println();
    }
  }

  private void sort(int[] arrays) {
    Arrays.sort(arrays);
  }
}
