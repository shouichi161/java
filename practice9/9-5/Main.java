import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    String mag = "第一土曜";
    Reader sr = new StringReader(mag);
    char c1 = (char) sr.read();
    char c2 = (char) sr.read();
    char c3 = (char) sr.read();
    char c4 = (char) sr.read();

    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);
    System.out.println(c4);
  }
}