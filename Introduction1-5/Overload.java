public class Overload {
  // 1つ目のメソッド
  public static int add(int x, int y) {
    return x + y;
  }
  // 2つ目のメソッド
  public static int add (int x, int y,int z) {
    return x + y + z;
  }
  // 3つ目のメソッド
  public static double add(double x, double y) {
    return x + y;
  }
  // 4つ目のメソッド
  public static String add (String x, String y) {
    return x + y;
  }
  public static void main(String[] args) {
    System.out.println("10+20=" + add(10, 20));
    System.out.println("40+50+30=" + add(40, 50, 30));
    System.out.println(add(3.5, 2.7));
    System.out.println(add("Hello", "World"));
  }
}