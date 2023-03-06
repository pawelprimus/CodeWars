package src.primus.pawel;

// Does my number look big in this?
// 6kyu
// https://www.codewars.com/kata/5287e858c6b5a9678200083c/train/java
// 2023-03-06 T:20:36:40

public class Exercise_509 {

    public static boolean isNarcissistic(int number) {
        final String stringNumber = String.valueOf(number);
        final int POWER = stringNumber.length();

        return number == stringNumber
                .chars()
                .mapToObj(Character::getNumericValue)
                .map(i -> Math.pow(i, POWER))
                .mapToInt(Double::intValue)
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        System.out.println(isNarcissistic(153));
    }

}
