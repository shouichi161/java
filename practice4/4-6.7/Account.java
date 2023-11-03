public class Account implements Comparable<Account>{
  int accountNo;
  public Account(int no) {
    this.accountNo = no;
  }

  public int compareTo(Account obj) {
    if(this.accountNo < obj.accountNo) {
      return -1;
    }
    if(this.accountNo > obj.accountNo) {
      return 1;
    }
    return 0;
  }
}