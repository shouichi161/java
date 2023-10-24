import java.time.*;
import java.time.format.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
  public static void main(String[] args) {
    LocalDate d1 = LocalDate.of(2012,1,1);
    LocalDate d2 = LocalDate.of(2012,1,4);

    Period p1 = Period.ofDays(3);
    Period p2 = Period.between(d1,d2);

    LocalDate d3 = d2.plus(p2);
    System.out.println(d1);
    System.out.println(d2);
    System.out.println(p1);
    System.out.println(p2);
    System.out.println(d3);

    Date now = new Date();
    Calendar c = Calendar.getInstance();
    c.setTime(now);
    int day = c.get(Calendar.DAY_OF_MONTH);
    day += 100;
    c.set(Calendar.DAY_OF_MONTH, day);
    Date future = c.getTime();
    SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
    System.out.println(f.format(future));
    
    LocalDateTime now2 = LocalDateTime.now();
    LocalDateTime future2 = now2.plusDays(100);
    DateTimeFormatter f2 = DateTimeFormatter.ofPattern("西暦yyy年MM月dd日");
    System.out.println(future2.format(f2));
  }
}