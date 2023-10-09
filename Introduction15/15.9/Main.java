import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    for (int i = 1; i <= 100; i++) {
      sb.append(i + ",");
    }
    String s = sb.toString();
    System.out.println(s);
    String[] a = s.split(",");
    System.out.println(a[2]);

    FileName f = new FileName();
    System.out.println(f.concatPath("c:¥java","readme.txt"));
    System.out.println(f.concatPath("c:¥java¥","readme.txt"));

    Date now = new Date();
    Calendar c = Calendar.getInstance();
    c.setTime(now);
    int day = c.get(Calendar.DAY_OF_MONTH);
    day += 100;
    c.set(Calendar.DAY_OF_MONTH, day);
    Date d = c.getTime();
    SimpleDateFormat fo = new SimpleDateFormat("西暦yyyy年MM月dd日");
    System.out.println(fo.format(d));

    LocalDateTime l1 = LocalDateTime.now();
    LocalDateTime l2 = l1.plusDays(100);
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
    System.out.println(l2.format(fmt));
  }
}