import java.time.*;
import java.time.format.*;

public class Main {
  public static void main(String[] args) {
    DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    LocalDate d = LocalDate.parse("2011/08/21", f);
    System.out.println(d);

    d = d.plusDays(365);
    String str = d.format(f);
    System.out.println("365日後は" + str);
  }
}