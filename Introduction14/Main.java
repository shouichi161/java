public class Main {
  public static void main(String[] args) {
    Empty e = new Empty();
    String s = e.toString();
    System.out.println(s);
    Object o1 = new Empty();
    Object o2 = new Hero();
    Object o3 = "こんにちは";
    System.out.println(o1);
    System.out.println(o2);
    System.out.println(o3);
    Printer p = new Printer();
    p.printAnything(100);
    p.printAnything("Hello");
    p.printAnything(o3);
    Hero h1 = new Hero();
    h1.name = "ミナト";
    h1.hp = 100;
    System.out.println(h1.toString());
    Hero h2 = new Hero();
    h2.name = "ミナト";
    h2.hp = 100;
    if (h1.equals(h2) == true) {
      System.out.println("同じ内容です");
    }  else {
      System.out.println("違う内容です");
    }
  }
}