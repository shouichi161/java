public class Main {
  public static void main(String[] args) {
    final String FORMAT = "%8s %6s 所持金%,5d";
    Hero h1 = new Hero();
    h1.name = "minato";
    h1.gold = 100;
    Witch w1 = new Witch();
    w1.name = "asaka";
    w1.gold = 200;
    Sage sa1 = new Sage();
    sa1.name = "sugawara";
    sa1.gold = 300;
    String s1 = String.format(FORMAT,h1.getName(),h1.getJob(),h1.getGold());
    String s2 = String.format(FORMAT,w1.getName(),w1.getJob(),w1.getGold());
    String s3 = String.format(FORMAT,sa1.getName(),sa1.getJob(),sa1.getGold());
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
  }
}