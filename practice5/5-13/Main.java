public class Main {
  public static void main(String[] args) {
    Pocket<Object> pocket = new Pocket<Object>();
    System.out.println("使い捨てのインスタンス作りpocketに入れます。");
    pocket.put(new Object() {
      String innerField;
      void innerMethod() {
      }
    });
  }
}