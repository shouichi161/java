public class King {
  void talk(Hero h) {
    System.out.println("ようこそ我が国へ、勇者" + h.getName() + "よ。");
    System.out.println("長旅疲れたであろう。");
    System.out.println("まずは城下町を見てくるとよい。ではまた会おう。");
    h.bye();
  }
}