import java.util.ArrayList;
import java.util.List;

public class Directory extends Entity {
  private List<Entity> entityList = new ArrayList<>();

  public Directory(String name) {
    super(name);
  }

  @Override
  public int getSize() {
    int total = 0;
    for (Entity entity : entityList) {
      total += entity.getSize();
    }
    return total;
  }

  public void add(Entity entity) {
    entityList.add(entity);
  }

  public void display() {
    for (Entity entity : entityList) {
      System.out.print(entity.getName() + " ");
    }
    System.out.println();
    System.out.println(getSize() + " bytes");
  }
}
