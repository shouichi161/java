public class Hero {
  String name = "ミナト";
  int hp = 100;

  public void run() {
    System.out.println(this.name + "は逃げ出した！");
  }
  public Hero() {
    System.out.println("Heroのコンストラクタが動作");
  }
}