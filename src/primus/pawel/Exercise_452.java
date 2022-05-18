package primus.pawel;

// Are we alternate?
// 6kyu
// https://www.codewars.com/kata/59325dc15dbb44b2440000af/train/java
// 2022-05-18 T:11:30:13
class Exercise_452 {

    private static final String VOWELS = "aeiou";

    public static boolean isAlt(String word) {

        char[] chars = word.toCharArray();
        boolean flag = isVowel(chars[0]);

        for (int i = 1; i < chars.length; i++) {

            if (isVowel(chars[i]) == flag) {
                return false;
            }
            flag = !flag;
        }
        return true;
    }

    private static boolean isVowel(char character) {
        return VOWELS.contains(String.valueOf(character));
    }

    public static void main(String[] args) {
        System.out.println(isAlt("banana"));
        System.out.println(isAlt("apple"));
    }
}
