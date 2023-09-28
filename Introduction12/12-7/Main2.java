public class Main2 {
  public static void main(String[] args) {
    Y[] y3 = new Y[2];
    y3[0] = new A();
    y3[1] = new B();
    for (Y y : y3) {
      y.b();
    }
  }
}