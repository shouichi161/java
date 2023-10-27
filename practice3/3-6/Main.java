import java.util.Set;
import java.util.TreeSet;

public class Main {
  public static void main(String[] args) {
    Set<String> words = new TreeSet<String>();
    words.add("dog");
    words.add("cat");
    words.add("wolf");
    words.add("panda");
    words.add("りんご");
    words.add("みかん");
    words.add("もも");
    words.add("葡萄");
    words.add("桃");
    words.add("林檎");
    for(String s : words) {
      System.out.print(s + "→");
    }
    
  }
}