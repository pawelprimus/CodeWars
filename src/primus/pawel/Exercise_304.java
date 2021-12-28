package primus.pawel;

// Hungarian Vowel Harmony (easy)
// 7kyu
// https://www.codewars.com/kata/57fd696e26b06857eb0011e7/train/java
// 2021-12-28 T:18:22:06
class Exercise_304 {

    private static final String FRONT_VOWEL = "eéiíöőüű";
    private static final String BACK_VOWEL = "aáoóuú";
    private static final String FRONT_SUFIX = "nek";
    private static final String BACK_SUFIX = "nak";

    public static String dative(String word) {
        for (int i = word.length() - 1; i >= 0; i--) {
            if (FRONT_VOWEL.contains(String.valueOf(word.charAt(i)))) {
                return word + FRONT_SUFIX;
            } else if (BACK_VOWEL.contains(String.valueOf(word.charAt(i)))) {
                return word + BACK_SUFIX;
            }
        }
        return word;
    }
}