public class Main {
  public static void main(String[] args) {
    String s1 = "Java and JavaScript";
    if (s1.contains("Java")) {
      System.out.println("文字列s1はJavaを含んでいます");
    }
    if (s1.endsWith("Java")) {
      System.out.println("文字列s1はJavaが末尾にあります");
    }
    if (s1.endsWith("Script")) {
      System.out.println("文字列s1はScriptが末尾にあります");
    }
    System.out.println("文字列s1で最初にJavaが登場する場所は" + s1.indexOf("Java"));
    System.out.println("文字列s1で最後にJavaが登場する場所は" + s1.lastIndexOf("Java"));
  }
}