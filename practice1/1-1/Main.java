public class Main {
  public static void main(String[] args) {
    String s1 = "スッキリJava";
    String s2 = "Java";
    String s3 = "java";
    String s4 = "java";
    if(s3.equals(s4)) {
      System.out.println("s3とs4は等しい");
    }
    if(s2.equalsIgnoreCase(s3)) {
      System.out.println("s2とs3はケースを区別しなければ等しい");
    }
    System.out.println("s1の長さは" + s1.length() + "です");
    if(s1.isEmpty()) {
      System.out.println("s1はから文字です");
    }
  }
}