package primus.pawel;

// Simple transposition
// 6kyu
// https://www.codewars.com/kata/57a153e872292d7c030009d4/train/java
// 2022-05-18 T:11:42:05
class Exercise_437 {


    public static String simpleTransposition(String text) {
        StringBuilder partOne = new StringBuilder();
        StringBuilder partTwo = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            if (i % 2 == 0) {
                partOne.append(text.charAt(i));
            } else {
                partTwo.append(text.charAt(i));
            }
        }

        return partOne.append(partTwo).toString(); // Do your magic!
    }

}
