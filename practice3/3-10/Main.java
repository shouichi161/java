import java.util.*;

public class Main {
  public static void main(String[] args) {
    Hero h1 = new Hero("斎藤");
    Hero h2 = new Hero("鈴木");
    List<Hero> heroes = new ArrayList<Hero>();
    heroes.add(h1);
    heroes.add(h2);
    for(Hero h : heroes) {
      System.out.println(h.getName());
    }
    Map<Hero, Integer> heroes2 = new HashMap<Hero, Integer>();
    heroes2.put(h1, 3);
    heroes2.put(h2,7);
    for(Hero key : heroes2.keySet()) {
      int value = heroes2.get(key);
      System.out.println(key.getName() + "が倒した敵" + value);
    }
  }
}