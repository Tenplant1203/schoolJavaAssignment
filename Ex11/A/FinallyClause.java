public class FinallyClause {
  static int count = 0;

  public static void main(String[] args) {
    System.out.println("Main program starts.");
    while (true) {
      try {
        if (++count == 2)
          throw new Exception();
        if (count == 3)
          break;
        System.out.println("(" + count + ") No exception");
      } catch (Exception e) {
        System.out.println("(" + count + ") Exception occurred");
      } finally {
        System.out.println("(" + count + ") in finally clause");
      }
    } // end while
    System.out.println("Main program ends.");
  }
}

// Main program starts.
// (1) No exception
// (1) in finally clause
// (2) Exception occurred
// (2) in finally clause
// (3) in finally clause
// Main program ends.
