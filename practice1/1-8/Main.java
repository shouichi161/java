public class Main {
  public static void main(String[] args) {
    String s = "abc,def:ghi";
    String w = s.replaceAll("[beh]","X");
    System.out.println(w);

    String s2 = "こんにちは";
    String w2 = s2.replaceAll("[こんにちは]","こんばんは");
    System.out.println(w2);
    String w3 = s2.replaceAll("こんにちは","こんばんは");
    System.out.println(w3);
  }
}