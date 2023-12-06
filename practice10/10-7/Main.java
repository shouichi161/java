import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Hero hero1 = new Hero("ミナト", 75, 18);

    FileOutputStream fos = new FileOutputStream("c:¥¥rpgsave.dat");
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    oos.writeObject(hero1);
    oos.flush();
    oos.close();

    FileInputStream fis = new FileInputStream("c:¥¥rpgsave.dat");
    ObjectInputStream ois = new ObjectInputStream(fis);
    Hero hero2 = (Hero) ois.readObject();
    ois.close();
  }
}