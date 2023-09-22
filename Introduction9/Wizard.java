public class Wizard {
  String name;
  int hp;
  public void heal(hero h) {
    h.hp += 10;
    system.out.println(h.name + "のHPを10回復した!");
  }
}