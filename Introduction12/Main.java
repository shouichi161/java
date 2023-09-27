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
  }
}