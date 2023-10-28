import java.util.Set;
import java.util.TreeSet;
import java.util.LinkedHashSet;

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
    
    Set<String> words2 = new LinkedHashSet<String>();
    words2.add("dog");
    words2.add("cat");
    words2.add("wolf");
    words2.add("panda");
    words2.add("りんご");
    words2.add("みかん");
    words2.add("もも");
    words2.add("葡萄");
    words2.add("桃");
    words2.add("林檎");
    for(String s2 : words2) {
      System.out.print(s2 + "→");
    }
    
  }
}