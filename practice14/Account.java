public class Account {
  String owner;
  int balance;
  public void Account(String owner, int balance) {
    owner = owner;
    balance = balance;
  }
  public void transfer(Account dest, int amount) {
    dest.balance += amount;
    balance -= amount;
  }
}