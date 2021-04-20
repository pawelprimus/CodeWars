package primus.pawel;

// Alternate capitalization
// 7kyu
// https://www.codewars.com/kata/59cfc000aeb2844d16000075/train/java
// 2021-04-20 T:23:38:35
class Exercise_088 {

    public static String[] capitalize(String s) {
        StringBuilder firstWord = new StringBuilder();
        StringBuilder secondWord = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 != 0) {
                firstWord.append(s.charAt(i));
                secondWord.append(Character.toUpperCase(s.charAt(i)));
            } else {
                firstWord.append(Character.toUpperCase(s.charAt(i)));
                secondWord.append(s.charAt(i));
            }
        }
        return new String[]{firstWord.toString(), secondWord.toString()};
    }
}
