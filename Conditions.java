public class Conditions {
  public static void main (String[] args) {
    // if文
    boolean tenki = true;
    if (tenki == true) {
      System.out.println("洗濯をします");
      System.out.println("散歩に行きます");
    } else {
      System.out.println("DVDを見ます");
    }

    //switch
    System.out.println("あなたの運勢を占います。");
    int fortune = new java.util.Random().nextInt(4);
    switch (fortune) {
      case 1:
        System.out.println("大吉");
      break;
      case 2:
        System.out.println("中吉");
      break;
      case 3:
        System.out.println("吉");
      break;
      default:
        System.out.println("凶");
    }

    //for
    for (int i = 0; i < 10; i++) {
      System.out.println("こんにちは");
    }

    for (int j = 0; j < 3; j++) {
      System.out.print("現在" + (j + 1) + "週目→");
    }
  }
}