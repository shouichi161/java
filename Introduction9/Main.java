public class Main {
  public static void main(String[] args) {
    Sword s1 = new Sword();
    s1.name = "炎の剣";
    s1.damage = 10;
    Hero h1 = new Hero("ミナト");
    h1.sword = s1;
    System.out.println(h1.name + "の現在の武器は" + h1.sword.name);
    h1.attack();
    Hero h2 = new Hero("アサカ");
    Wizard w1 = new Wizard();
    w1.name = "スガワラ";
    w1.hp = 50;
    w1.heal(h1);
    w1.heal(h2);
    w1.heal(h2);
    System.out.println(h1.hp);
    System.out.println(h2.hp);
    Hero h3 = new Hero();
    System.out.println(h3.name);
  }
}