package primus.pawel;

// Basic Calculator
// 7kyu
// https://www.codewars.com/kata/5296455e4fe0cdf2e000059f/train/java
// 2022-01-09 T:19:01:09
class Exercise_336 {


    public static Double calculate(final double numberOne, final String operation, final double numberTwo) {
        switch (operation) {
            case "+":
                return numberOne + numberTwo;
            case "-":
                return numberOne - numberTwo;
            case "*":
                return numberTwo != 0 ? numberOne * numberTwo : 0.0;
            case "/":
                return numberTwo != 0 ? numberOne / numberTwo : null;
            default:
                return null;
        }
    }
}
