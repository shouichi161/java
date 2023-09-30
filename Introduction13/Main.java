public class Main {
  public static void main(String[] args) {
    Hero h1 = new Hero("ミナト");
    King k = new King();
    k.talk(h1);
    h1.setName("");
  }
}