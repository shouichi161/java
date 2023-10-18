public class Main {
  public static void main(String[] args) {
    String s1 = "Java programming";
    System.out.println("文字列s1の4文字目以降は" + s1.substring(3));
    System.out.println("文字列s1の4~8文字目は" + s1.substring(3,8));

    String s2 = "JAVA PROGRAMMING";
    System.out.println(s2.toLowerCase());
    System.out.println(s1.toUpperCase());
    System.out.println(s1.replace("Java", "Ruby"));
    
    String s3 = "   Java programming ";
    System.out.println(s3.trim());
  }
}