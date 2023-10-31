public class Main {
  public static void main(String[] args) {
    Account a = new Account();
    a.accountNo = "1111";
    Account b = new Account();
    b.accountNo = "2222";
    Account c = new Account();
    c.accountNo = "2222";
    System.out.println(a.equals(b));
    System.out.println(b.equals(c));
  }
}