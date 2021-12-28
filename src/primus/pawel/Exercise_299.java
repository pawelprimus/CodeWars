package primus.pawel;

// Inspiring Strings
// 7kyu
// https://www.codewars.com/kata/5939ab6eed348a945f0007b2/train/java
// 2021-12-28 T:18:03:22
class Exercise_299 {

    public static String longestWord(String wordString) {
        String[] words = wordString.split(" ");
        int biggestLength = Integer.MIN_VALUE;
        for (int i = 0; i < words.length; i++) {

            if (words[i].length() > biggestLength) {
                biggestLength = words[i].length();
            }
        }

        for (int i = words.length; i >= 0; i--) {
            if (words[i].length() == biggestLength) {
                return words[i];
            }
        }
        return "";
    }


}
