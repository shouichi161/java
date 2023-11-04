public class Sword implements Cloneable {
  private String name;

  public Sword clone() {
    Sword result2 = new Sword();
    result2.name = this.name;
    return result2;
  }

  public String getName() {
    return this.name;
  }
  public void setName(String name) {
    this.name = name;
  }


}