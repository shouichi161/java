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

    for (int k = 1; k < 10; k++) {
      for (int l = 1; l < 10; l++) {
        System.out.print(k * l);
        System.out.print(" ");
      }
      System.out.println("");
    }

    int isHungry = 1;
    String food = "ハンバーグ";
    System.out.println("こんにちは");
    if (isHungry == 0) {
      System.out.println("お腹がいっぱいです");
    } else {
      System.out.println("はらぺこです");
    }
    if (isHungry == 1) {
      System.out.println(food + "をいただきます");
    }
      System.out.println("ごちそうさまでした");

    System.out.print("[メニュー] 1:検索 2:登録 3:削除 4:変更>");
    int selected = new java.util.Scanner(System.in).nextInt();
    switch (selected) {
      case 1:
        System.out.println("検索します");
        break;
      case 2:
        System.out.println("登録します");
        break;
      case 3:
        System.out.println("削除します");
        break;
      case 4:
        System.out.println("変更します");
        break;
    }

    System.out.println("数当てゲーム");
    int ans = new java.util.Random().nextInt(10);
    for (int m = 0; m < 5; m++) {
      System.out.println("0~9の数字を入力してください");
      int num = new java.util.Scanner(System.in).nextInt();
      if (ans == num) {
        System.out.println("あたり!");
        break;
      } else {
        System.out.println("違います");
      }
    }
    System.out.println("ゲームを終了します");
  }
}