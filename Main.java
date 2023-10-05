public class Main {
  public static void main(String[] args) {
    String s1 = "スッキリJava";
    String s2 = "Java";
    String s3 = "java";
    String s4 = "";
    if (s2.equals(s3)) {
      System.out.println("s2とs3は等しい");
    }
    if (s2.equalsIgnoreCase(s3)) {
      System.out.println("s2とs3はケースを区別しなければ等しい");
    }
    System.out.println("s1の長さは" + s1.length() + "です");
    if (s4.isEmpty()) {
      System.out.println("s4は空文字です");
    }

    String s5 = "Java and JavaScript";
    if (s5.contains("Java")) {
      System.out.println("文字列s5は、Javaを含んでいます");
    }
    if (s5.endsWith("Java")) {
      System.out.println("文字列s5は、Javaが末尾にあります");
    }
    System.out.println("文字列s5で最初にJavaが登場する位置は" + s5.indexOf("Java"));
    System.out.println("文字列s5で最後にJavaが登場する位置は" + s5.lastIndexOf("Java"));
  }
}