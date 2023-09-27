public class Main {
  public static void main(String[] args) {
    Computer c = new Computer("パソコン", 50000, "白", "あ");
    System.out.println(c.name);
    System.out.println(c.price);
    System.out.println(c.color);
    System.out.println(c.makeName);
    Book b = new Book("java", 2000, "緑", "あ");
    System.out.println(b.name);
    System.out.println(b.price);
    System.out.println(b.color);
    System.out.println(b.isbn);
  }
}