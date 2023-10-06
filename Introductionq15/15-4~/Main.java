public class Main {
  public static void main(String[] args) {
    // String s = "abc def ghi";
    // String[] words = s.split("[ ]");
    // for (String w : words) {
    //   System.out.print(w + ",");
    // }
    
    // String w = s.replaceAll("[beh]","X");
    // System.out.println(w);
    Hero h1 = new Hero();
    h1.setName("ミナト");
    h1.setJob("hero");
    h1.setGold(100);
    Hero h2 = new Hero();
    h2.setName("ナギ");
    h2.setJob("hero");
    h2.setGold(10000);
    final String FORMAT = "%-9s %-13s 所持金%,6d";
    String s = String.format(FORMAT, h1.getName(), h1.getJob(), h1.getGold());
    System.out.println(s);
    String s2 = String.format(FORMAT, h2.getName(), h2.getJob(), h2.getGold());
    System.out.println(s2);
  }
}