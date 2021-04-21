package primus.pawel;

// Make a function that does arithmetic!
// 7kyu
// https://www.codewars.com/kata/583f158ea20cfcbeb400000a/train/java
// 2021-04-21 T:20:26:42
class Exercise_091 {

    public static int arithmetic(int a, int b, String operator) {

        switch (operator) {
            case "add":
                return a + b;
            case "subtract":
                return a - b;
            case "multiply":
                return a * b;
            case "divide":
                return a / b;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(arithmetic(2, 3, "add"));
    }

}
/*public class ArithmeticFunction {
  static Map<String, BinaryOperator<Integer>> operators = new HashMap<>();

  static {
    operators.put("add", (a, b) -> a + b);
    operators.put("subtract", (a, b) -> a - b);
    operators.put("multiply", (a, b) -> a * b);
    operators.put("divide", (a, b) -> a / b);
  }

  public static int arithmetic(int a, int b, String operator) {
    return arithmetic(a, b, operators.get(operator));
  }

  private static Integer arithmetic(int a, int b, BinaryOperator<Integer> operator) {
    return Optional.ofNullable(operator).orElse((x, y) -> 0).apply(a, b);
  }
}*/