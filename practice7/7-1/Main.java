public class Main {
  public static void main(String[] args) {
    int i1 = 1;
    if (i1 != 2) {
      System.out.println("データが壊れています。異常終了します。");
      System.exit(1);
    }
    System.out.println("正常終了しました。");
  }

}