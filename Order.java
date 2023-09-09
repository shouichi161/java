public class Order {
  public static void main(String[] args) {
    String name = "すがわら";
    // 改行あり
    System.out.println("私の名前は");
    System.out.println(name);
    System.out.println("です");

    // 改行なし
    System.out.print("私の名前は");
    System.out.print(name);
    System.out.print("です");

    // 大きい方の数値を代入
    int a = 5;
    int b = 3;
    int m = Math.max(a,b);
    System.out.println("比較実験:" + a + "と" + b + "とで大きい方は" + m);

    // String型をint型に変換する
    String age = "10";
    int n = Integer.parseInt(age);
    System.out.println("来年は、" + (n+1) + "歳になります");

    // ランダムな数を生成
    int r = new java.util.Random().nextInt(90);
    System.out.println(r);

    //キーボードの入力を受け付ける
    System.out.println("あなたの名前を入力してください。");
    String name2 = new java.util.Scanner(System.in).nextLine();
    System.out.println("あなたの年齢を入力してください。");
    int age2 = new java.util.Scanner(System.in).nextInt();
    System.out.println("ようこそ" + age2 + "歳の" + name2 + "さん");


    System.out.println("ようこそ占いの館へ");
    System.out.println("あなたの名前を入力してください。");
    String name3 = new java.util.Scanner(System.in).nextLine();
    System.out.println("あなたの年齢を入力してください。");
    String ageString = new java.util.Scanner(System.in).nextLine();
    int age3 = Integer.parseInt(ageString);
    int fortune = new java.util.Random().nextInt(4);
    fortune++;
    System.out.println("占いの結果が出ました!");
    System.out.println(age3 + "歳の" + name3 + "さん、あなたの運気番号は" + fortune + "です");
    System.out.println("1:大吉　２:中吉　3:小吉　4:凶");
  }
}