package primus.pawel;

// Simple string reversal
// 7kyu
// https://www.codewars.com/kata/5a71939d373c2e634200008e/train/java
// 2021-05-19 T:18:27:31
class Exercise_133_todo {
    public static String solve(String s) {
        String[] wordsArr = s.split("\\W+");
        StringBuilder sb = new StringBuilder();
        StringBuilder sbResult = new StringBuilder();
        for (int i = wordsArr.length-1; i >= 0 ; i--) {
            sb.append(wordsArr[i]);
            sbResult.append(sb.reverse()).append(" ");
            sb.delete(0, sb.length());
        }

        return sbResult.toString().trim();
    }
}
