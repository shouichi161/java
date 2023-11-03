import java.util.*;

public class Main {
  public static void main(String[] args) {
    List<Account> list = new ArrayList<Account>();
    Account a1 = new Account(3333);
    Account a2 = new Account(2222);
    Account a3 = new Account(1111);
    list.add(a1);
    list.add(a2);
    list.add(a3);
    for(Account s : list) {
      System.out.println(s.accountNo);
    }
    Collections.sort(list);
    for(Account s : list) {
      System.out.println(s.accountNo);
    }
  }
}