public class Account {
  String accountNumber;
  int balance;

  public String toString() {
    return "¥" + this.balance + "(口座番号：" + this.accountNumber + ")";
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o instanceof Account) {
      Account a = (Account)o;
      String a2 = this.accountNumber.trim();
      String a3 = a.accountNumber.trim();
      if (a2.equals(a3)) {
        return true;
      }
    }
    return false;
  }
}