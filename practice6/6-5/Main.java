import java.util.function.*;
public class Main {
  public static void main(String[] args) {
    IntBinaryOperator func = (int a, int b) -> { return a - b; };
    int a = func.applyAsInt(5,3);
    System.out.println("5-3は" + a);
    IntToDoubleFunction func2 = (int x) -> { return x * x * 3.14; };
    double a2 = func2.applyAsDouble(5);
    System.out.println(a2);
    IntToDoubleFunction func3 = (x) -> { return x * x * 3.14; };
    double a3 = func3.applyAsDouble(5);
    System.out.println(a3);
    IntToDoubleFunction func4 = x -> { return x * x * 3.14; };
    double a4 = func4.applyAsDouble(5);
    System.out.println(a4);
    IntToDoubleFunction func5 = x -> x * x * 3.14;
    double a5 = func5.applyAsDouble(5);
    System.out.println(a5);

    double b = 1.41;
    IntToDoubleFunction func6 = (x) -> { return x * x * b; };
    double a6 = func6.applyAsDouble(5);
    System.out.println(a6);
  }
}