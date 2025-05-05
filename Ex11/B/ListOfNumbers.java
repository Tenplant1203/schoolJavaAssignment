public class ListOfNumbers {
  private static final int SIZE = 10;
  private int[] vector;

  public ListOfNumbers() {
    vector = new int[SIZE];
    for (int i = 0; i < SIZE; i++)
      vector[i] = i;
  }

  public void writeList() {
    int i = 0;
    try {
      for (i = 0; i <= SIZE; i++) {
        System.out.println("Value at: " + i + " = " + vector[i]);
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Entering catch block.");
      System.out.println("Caught ArrayIndexOutOfBoundsException: Index " + i + " out of bounds for length " + i);
    } finally {
      System.out.println("Entering finally block.");
    }
  }

  public static void main(String[] args) {
    ListOfNumbers l = new ListOfNumbers();
    l.writeList();
  }
}
