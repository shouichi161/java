import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
  public static void main(String[] args) throws Exception {
    // String s = "abc def ghi";
    // String[] words = s.split("[ ]");
    // for (String w : words) {
    //   System.out.print(w + ",");
    // }

    // String w = s.replaceAll("[beh]","X");
    // System.out.println(w);
    Hero h1 = new Hero();
    h1.setName("ミナト");
    h1.setJob("hero");
    h1.setGold(100);
    Hero h2 = new Hero();
    h2.setName("ナギ");
    h2.setJob("hero");
    h2.setGold(10000);
    final String FORMAT = "%-9s %-13s 所持金%,6d";
    String s = String.format(FORMAT, h1.getName(), h1.getJob(), h1.getGold());
    System.out.println(s);
    String s2 = String.format(FORMAT, h2.getName(), h2.getJob(), h2.getGold());
    System.out.println(s2);

    long start = System.currentTimeMillis();
    long end = System.currentTimeMillis();
    System.out.println("処理にかかった時間は" + (end - start) + "ミリ秒でした");

    Date now = new Date();
    System.out.println(now);
    System.out.println(now.getTime());
    Date past = new Date(1600705425827L);
    System.out.println(past);

    Calendar c = Calendar.getInstance();
    c.set(2019,8,22,1,23,45);
    Date d = c.getTime();
    System.out.println(d);
    Date now2 = new Date();
    c.setTime(now2);
    int y = c.get(Calendar.YEAR);
    System.out.println("今は" + y + "年です");
    
    
    SimpleDateFormat f = new SimpleDateFormat("yyyy/mm/dd hh:mm:ss");
    Date d2 = f.parse("2020/9/22 01:23:45");
    System.out.println(d2);
    Date now3 = new Date();
    String s3 = f.format(now3);
    System.out.println("今は" + s3 + "です");
  }
}