public class Thief extends Character {
  public Thief() {
    this.hp = 80;
  }
  public void attack(Matango m) {
    System.out.println(this.name + "の攻撃！");
    System.out.println("敵に3ポイントのダメージ");
    m.hp -= 7;
  }
}