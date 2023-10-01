public class Main {
  public static void main(String[] args) {
    Hero h1 = new Hero("ミナト");
    King k = new King();
    k.talk(h1);
    // h1.setName("");
    Wizard wi = new Wizard();
    // wi.setName("あい");
    wi.setHp(-100);
    System.out.println(wi.getHp());
    wi.setMp(50);
    Wand wa = new Wand();
    wa.setName("魔法のつえ");
    wa.setPower(10);
    wi.setWand(wa);
    wi.heal(h1);
  }
}