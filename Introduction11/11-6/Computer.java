public class Computer extends TangibleAsset {
  String makeName;
  public Computer(String name, int price, String color, String makeName) {
    super(name, price, color);
    this.makeName = makeName;
  }
  public String getMakeName() {return this.makeName; }
}