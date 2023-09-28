public class Main {
  public static void main (String[] args) {
    Wizard w = new Wizard();
    Matango m = new Matango();
    w.name = "アサカ";
    w.attack(m);
    w.fireball(m);
    System.out.println(m.hp);
    Slime s = new Slime(); Monster m2 = new Slime();
    s.run(); m2.run();
    Character[] c = new Character[5];
    c[0] = new Hero();
    c[1] = new Hero();
    c[2] = new Thief();
    c[3] = new Wizard();
    c[4] = new Wizard();
    // 宿屋に泊まる
    for (Character ch : c) {
      ch.hp += 50;
      System.out.println(ch.hp);
    }
    Monster[] monsters = new Monster[3];
    monsters[0] = new Slime();
    monsters[1] = new Matango();
    monsters[2] = new Goblin();
    for (Monster mo2 : monsters) {
      mo2.run();
    }
  }
}