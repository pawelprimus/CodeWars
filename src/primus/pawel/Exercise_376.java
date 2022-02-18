package primus.pawel;

// Automorphic Number (Special Numbers Series #6)
// 7kyu
// https://www.codewars.com/kata/5a58d889880385c2f40000aa/train/java
// 2022-02-18 T:23:48:34
class Exercise_376 {

    private static final String CORRECT = "Automorphic";
    private static final String NOT = "Not!!";

    public static String autoMorphic(int number) {

        String notSquared = String.valueOf(number);
        String squared = String.valueOf(number * number);

        return squared.substring(squared.length() - notSquared.length()).equals(notSquared) ? CORRECT : NOT;
    }
}
