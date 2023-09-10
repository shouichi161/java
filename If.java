public class If {
  public static void main (String[] args) {
    boolean tenki = true;
    if (tenki == true) {
      System.out.println("洗濯をします");
      System.out.println("散歩に行きます");
    } else {
      System.out.println("DVDを見ます");
    }
    
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
  }
}