package primus.pawel;

// Simple equation reversal
// 7kyu
// https://www.codewars.com/kata/5aa3af22ba1bb5209f000037/train/java
// 2021-12-13 T:21:04:39
class Exercise_311 {
    public static String solve(String eq) {
        StringBuilder result = new StringBuilder();
        String[] mathSigns = eq.split("[A-Za-z0-9]");
        String[] numberAndChars = eq.split("[+*/-]");
        int mathSignsIndex = mathSigns.length - 1;

        for (int i = numberAndChars.length - 1; i >= 0; i--) {
            result.append(numberAndChars[i]);
            while (mathSigns[mathSignsIndex].equals("") && mathSignsIndex>0) {
                mathSignsIndex--;
            }
            result.append(mathSigns[mathSignsIndex]);
            mathSignsIndex--;
        }
        return result.toString().trim();
    }


    public static void main(String[] args) {
        System.out.println(solve("s-v/f-j/u/7+l-60-36-l"));
    }
}
