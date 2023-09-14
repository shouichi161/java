public class Method {
  public static void main(String[] args) {
    //メソッドの呼び出し,引数
    System.out.println("メソッドを呼び出します");
    hello("凪");
    hello("朝香");
    hello("菅原");
    System.out.println("メソッドの呼び出しが終わりました");
    //複数の引数
    add(100 ,20);
    add(200, 50);
  }
  public static void hello(String name) {
    System.out.println(name + "さん、こんにちは");
  }

  //複数の値を受け取るaddメソッド
  public static void add(int x, int y) {
    int ans = x + y;
    System.out.println(x + "+" + y + "=" + ans);
  }

}