public class Main {
  public static void main(String[] args) {
    String s = "Java";
    System.out.println(s.matches("Java"));
    System.out.println(s.matches("java"));
    System.out.println(s.matches("[A-Z][a-z]{3}"));
    System.out.println(s.matches("J.va"));
    System.out.println("Jaaaaaaava".matches("Ja*va"));
    System.out.println("あいうxx019".matches(".*"));
  }
}