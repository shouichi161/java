import java.util.*;

class Hero {
  public String name;
  public boolean equals(Object o) {
    if(o == this) return true;
    if(o == null) return false;
    if(!(o instanceof Hero)) return false;
    Hero r = (Hero) o;
    if(!this.name.equals(r.name)) {
      return false;
    }
    return true;
  }
}

public class Main {
  public static void main(String[] args) {
    Set<Hero> list = new HashSet<Hero>();
    Hero h1 = new Hero();
    h1.name = "ミナト";
    list.add(h1);
    System.out.println("要素数" + list.size());
    h1 = new Hero();
    h1.name = "ミナト";
    list.remove(h1);
    System.out.println("要素数" + list.size());
  }
}