import java.util.*;
public class Main {
  public static void main(String[] args){
    Hero h1 = new Hero("斎藤");
    Hero h2 = new Hero("鈴木");
    ArrayList<Hero> heroes= new ArrayList<Hero>();
    heroes.add(h1);
    heroes.add(h2);
    for (Hero h : heroes)
    System.out.println(h.getName());
    
    Map<Hero, Integer> dest = new HashMap<Hero, Integer>();
    dest.put(h1, 3);
    dest.put(h2, 7);
    for (Hero key : dest.keySet()) {
      int value = dest.get(key);
      System.out.println(key.getName() + "が倒した敵=" + value);
    }
  }  
}