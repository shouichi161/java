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
  }
}