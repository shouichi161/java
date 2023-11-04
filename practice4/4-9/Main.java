public class Main {
  public static void main(String[] args) {
    Hero h1 = new Hero();
    h1.name = "ミナト";
    h1.hp = 100;
    Sword s = new Sword();
    s.setName("鋼の剣");
    h1.setSword(s);
    System.out.println("装備：" + h1.getSword().getName());
    System.out.println("clone()で複製します");
    Hero h2 = h1.clone();
    System.out.println("コピー元の勇者の剣の名を変えます");
    h1.getSword().setName("檜のぼう");
    System.out.println("コピー元とコピー先のの勇者の装備を表示します");
    System.out.print("コピー元:" + h1.getSword().getName() + "/コピー先:" + h2.getSword().getName());
  }
}