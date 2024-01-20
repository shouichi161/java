import org.junit.Test;
import static org.junit.Assert.*;

public class BankTest {
  @test public void setNane() {
    Bank b = new Bank();
    b.setName("ミヤビ");
  }

  @test public void setNaneWithNull() {
    try {
      Bank b = new Bank();
      b.setName(null);
    } catch (NullPointerException e) {
      return;
    }
    fall();
  }

  @test(excepted = IllegalArgumentException.class)
  public void throwsExceptionWithTwoCharName() {
    Bank b = new Bank();
    b.setName("ミヤ");
  }
}