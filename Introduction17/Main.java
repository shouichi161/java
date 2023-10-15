import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    System.out.println("プログラムが起動しました。");
    throw new IOException();

    // try (FileWriter fw = new FileWriter("data.txt");) {
    //   fw.write("Hello!");
    // } catch (IOException e) {
    //   System.out.println("エラーが発生しました。");
    // }

    // String s = null;
    // try {
    // System.out.println(s.length());
    // } catch (NullPointerException e) {
    //   System.out.println("NullPointerException 例外をcatchしました");
    //   System.out.println("ーースタックトレース（ここから）ーー");
    //   e.printStackTrace();
    //   System.out.println("ーースタックトレース（ここまで）ーー");
    // }

    // try {
    // int i = Integer.parseInt("三");
    // } catch (NumberFormatException e) {
    //   System.out.println("NumberFormatExceptionの例外をcatchしました。");
    // }
  }
}