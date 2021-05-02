package primus.pawel;

// Character with longest consecutive repetition
// 6kyu
// https://www.codewars.com/kata/586d6cefbcc21eed7a001155/train/java
// 2021-05-02 T:20:08:54
class Exercise_104_toREF {
    public static Object[] longestRepetition(String s) {


        if (s.length() == 0) return new Object[]{"", 0};
        if (s.length() == 1) return new Object[]{"" + s.charAt(0), 1};
        Character bestChar = s.charAt(0);
        int currentRepp = 1;
        int maxRepp = 0;
        for (int i = 1; i < s.length(); i++) {

            if (s.charAt(i) != s.charAt(i - 1)) {
                if (currentRepp > maxRepp) {
                    bestChar = s.charAt(i - 1);
                    maxRepp = currentRepp;
                }
                currentRepp = 1;
            } else {
                currentRepp++;
                if (i == s.length() - 1) {
                    if (currentRepp > maxRepp) {
                        bestChar = s.charAt(i - 1);
                        maxRepp = currentRepp;
                    }
                }
            }
        }
        return new Object[]{bestChar.toString(), maxRepp};
    }

    public static void main(String[] args) {
        longestRepetition("");

    }
}
