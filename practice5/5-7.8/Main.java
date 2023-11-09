public class Main {
  public static void main(String[] args) {
    Account a1 = new Account("1732050", AccountType.TEIKI);
    System.out.println(a1.getAccountNo());
    System.out.println(a1.getAccountType());
  }
}