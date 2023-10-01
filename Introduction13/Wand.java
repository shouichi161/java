public class Wand {
  private String name;
  private double power;
  public String getName() {
    return this.name;
  }
  public void setName(String name) {
    if (name == null || name.length() < 3) {
      throw new IllegalArgumentException("名前が短すぎる、処理を中断");
    }
    this.name = name;
  }
  public double getPower() {
    return this.power;
  }
  public void setPower(double power) {
    this.power = power;
  }
}