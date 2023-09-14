public class Method {
  public static void main(String[] args) {
    //メソッドの呼び出し,引数
    System.out.println("メソッドを呼び出します");
    hello("凪");
    hello("朝香");
    hello("菅原");
    System.out.println("メソッドの呼び出しが終わりました");
  }
  public static void hello(String name) {
    System.out.println(name + "さん、こんにちは");
  }
  

}