import java.io.*;
import java.net.URL;

public class Main {
  public static void main(String[] args) throws Exception {
    FileWriter fw = new FileWriter("data.txt");
    fw.write('や');
    fw.write('っ');
    fw.write('ほ');
    fw.write('ー');
    fw.close();

    FileReader fr = new FileReader("data.txt");
    int input = fr.read();
    while (input != -1) {
      System.out.print((char)input);
      input = fr.read();
    }
    fr.close();
    
    URL u = new URL("https://book.impress.co.jp/");
    InputStream is = u.openStream();
    int i = is.read();
    while ( i != -1) {
      char c = (char)i;
      System.out.println(c);
      i = is.read();
    }
  }
}