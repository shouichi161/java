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
    //配列の引数
    int[] array = {1, 2, 3};
    printArray(array);
  }

  public static void hello(String name) {
    System.out.println(name + "さん、こんにちは");
  }

  //複数の値を受け取るaddメソッド
  public static int add(int x, int y) {
    int ans = x + y;
    return ans;
  }

  //int型配列を受け取り、全ての要素を表示するメソッド
  public static void printArray(int[] array) {
    for (int element : array) {
      System.out.println(element);
    }
  }
}