package primus.pawel;

// Consonant value
// 6kyu
// https://www.codewars.com/kata/59c633e7dcc4053512000073
// 2021-09-09 T:19:48:32
class Exercise_213 {

    public static int solve(final String s) {
        int currentSum = 0;
        int maximumSum = Integer.MIN_VALUE;
        char currentChar;
        for (int i = 0; i < s.length(); i++) {
            currentChar = s.charAt(i);
            if (isVowel(currentChar)) {
                if (currentSum > maximumSum) {
                    maximumSum = currentSum;
                }
                currentSum = 0;
            } else {
                currentSum += alphabeticIndex(currentChar);
            }

        }
        if (currentSum > maximumSum) {
            maximumSum = currentSum;
        }

        return maximumSum;
    }

    public static boolean isVowel(char letter) {
        return letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u';
    }

    public static int alphabeticIndex(char character) {
        return Character.toLowerCase(character) - 96;
    }
}
