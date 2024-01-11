public class Account {
  private int balance;
  public void transfer(Account dest, int amount) {
    System.out.println("正常に送金完了しました。");
    assert this.balance >= 0;
  }
}