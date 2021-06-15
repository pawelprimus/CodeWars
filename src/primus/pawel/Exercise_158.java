package primus.pawel;

// Numericals of a String
// 6kyu
// https://www.codewars.com/kata/5b4070144d7d8bbfe7000001/train/java
// 2021-06-15 T:20:36:43
class Exercise_158 {

    public static String numericals(String s) {

        int[] occurences = new int[2024];
        StringBuilder result = new StringBuilder();
        int index;
        for (int i = 0; i < s.length(); i++) {
            index = (int)s.charAt(i);
            occurences[index]++;
            result.append(occurences[index]);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        numericals("Hello, World! It's me, JomoPipi!");
    }
}
