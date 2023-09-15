public class Method {
  public static void main(String[] args) {
    //メソッドの呼び出し,引数
    System.out.println("メソッドを呼び出します");
    hello("凪");
    hello("朝香");
    hello("菅原");
    System.out.println("メソッドの呼び出しが終わりました");
    //複数の引数
    int ans = add(100, 10);
    System.out.println("100 + 10 = " + ans);
  }
  public static void hello(String name) {
    System.out.println(name + "さん、こんにちは");
  }

  //複数の値を受け取るaddメソッド
  public static int add(int x, int y) {
    int ans = x + y;
    return ans;
  }

}