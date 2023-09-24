public class PoisonMatango extends Matango {
  int poisonCount = 5;
  public PoisonMatango(char suffix) {
    super(suffix);
  }
  public void attack(Hero h) {
    super.attack(h);
    if (this.poisonCount > 0) {
      System.out.println("さらに毒の胞子をばらまいた！");
      int damage = h.hp / 5;
      h.hp -= damage;
      System.out.println(damage + "ポイントのダメージ!");
      System.out.println(h.name + "の残りHPは" + h.hp);
      this.poisonCount--;
    }
  }
}