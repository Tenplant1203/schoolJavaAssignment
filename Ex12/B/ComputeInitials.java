public class ComputeInitials {
  public static void main(String[] args) {
    String fullName = args[0];
    String[] names = fullName.split(" ");
    String initial = names[0].substring(0, 1) + names[1].substring(0, 1);
    System.out.println("My initials are: " + initial);
  }
}
