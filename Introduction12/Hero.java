public class Hero extends Character {
  public Hero() {
    this.hp = 100;
  }
  public void attack(Monster mo) {
    System.out.println(this.name + "の攻撃！");
    System.out.println("敵に3ポイントのダメージ");
    mo.hp -= 10;
  }
}