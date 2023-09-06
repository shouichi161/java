// import java.util.ArrayList;

// public class Collection {
//   public static void main(String[] args) {
//     ArrayList<Integer> points = new ArrayList<Integer>();
//     points.add(10);
//     points.add(80);
//     points.add(75);
//     for(int i :points) {
//     System.out.println(i);
//     }
//   }
// }

import java.util.*;

public class Collection {
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<String>();
    names.add("凪");
    names.add("朝香");
    names.add("菅原");
    names.add("有栖");
    Iterator<String> it = names.iterator();
    while(it.hasNext()) {
      String e = it.next();
      System.out.println(e);
    }
  }
}