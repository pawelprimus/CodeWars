package src.primus.pawel;

// Disarium Number (Special Numbers Series #3)
// 7kyu
// https://www.codewars.com/kata/5a53a17bfd56cb9c14000003/train/java
// 2023-01-31 T:22:37:04
public class Exercise_502 {

    private static final String DISARIUM = "Disarium !!";
    private static final String NOT_DISARIUM = "Not !!";

    public static String disariumNumber(int number) {
        String stringNumber = String.valueOf(number);
        int possibleDisarium = 0;
        for (int i = 0; i < stringNumber.length(); i++) {
            possibleDisarium += Math.pow(Character.getNumericValue(stringNumber.charAt(i)), i + 1);
        }
        return number == possibleDisarium ? DISARIUM : NOT_DISARIUM;
    }

    public static void main(String[] args) {
        System.out.println(disariumNumber(564));
    }
}
