public class Main {
  public static void main(String[] args) {
    Hero h1 = new Hero();
    h1.name = "ミナト";
    h1.hp = 100;
    Hero h2 = h1.clone();
    System.out.println(h1.name);
    System.out.println(h1.hp);
    System.out.println(h2.name);
    System.out.println(h2.hp);

  }
}