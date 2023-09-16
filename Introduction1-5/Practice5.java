public class Practice5 {
  public static void main(String[] args) {
    introduceOneself();
    String title = "テスト";
    String address = "aaa@.com";
    String text = "テストです";
    email(title, address, text);
    email(address, text);
  }

  public static void introduceOneself() {
    String name = "hina";
    int age = 22;
    double height = 165.5;
    char zodiac = '辰';
    System.out.println("私の名前は" + name);
    System.out.println("年齢は" + age);
    System.out.println("身長は" + height +"cm");
    System.out.println("十二支は" + zodiac);
  }
  public static void email(String title, String address, String text) {
    System.out.println(address + "に以下のメールを送信しました");
    System.out.println("件名：" + title);
    System.out.println("本文：" + text);
  }
  public static void email(String address, String text) {
    System.out.println(address + "に以下のメールを送信しました");
    System.out.println("件名：無題");
    System.out.println("本文：" + text);
  }
}