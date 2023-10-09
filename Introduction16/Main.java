import java.util.*;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> points = new ArrayList<Integer>();
    points.add(10);
    points.add(80);
    points.add(75);
    for (int i : points) {
      System.out.println(i);
    }

    ArrayList<String> names = new ArrayList<String>();
    names.add("湊");
    names.add("朝香");
    names.add("菅原");
    Iterator<String> it = names.iterator();
    while (it.hasNext()) {
      String e = it.next();
      System.out.println(e);
    }
  }
}