package primus.pawel;

// Count consonants
// 7kyu
// https://www.codewars.com/kata/564e7fc20f0b53eb02000106/train/java
// 2022-05-19 T:20:47:51
class Exercise_453 {

    private static final String CONSONANT = "BCDFGJKLMNPQSTVXZHRWY";

    public static int getCount(String str) {
        return (int) str.chars().filter(i -> isConsonant((char)i)).count();
    }

    private static boolean isConsonant(char character) {
        return CONSONANT.contains(String.valueOf(Character.toUpperCase(character)));
    }


    public static void main(String[] args) {

        System.out.println(getCount("helLo world"));
    }
}
