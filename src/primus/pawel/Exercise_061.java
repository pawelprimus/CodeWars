package primus.pawel;

// Highest Scoring Word
// 6kyu
// https://www.codewars.com/kata/57eb8fcdf670e99d9b000272/train/java
// 2021-04-08 T:20:45:53
class Exercise_061 {

    public static String high(String s) {
        String[] stringArr = s.split(" ");
        int sumMax = 0;
        int sum = 0;
        StringBuilder sbResult = new StringBuilder("");

        for (String word : stringArr) {
            for (int i = 0; i < word.length(); i++) {
                sum += word.charAt(i) - 96;
            }
            if (sum > sumMax) {
                sumMax = sum;
                sbResult.replace(0, sbResult.length(), word);
            }
            sum = 0;
        }
        return sbResult.toString();
    }

    public static void main(String[] args) {
    }

}
