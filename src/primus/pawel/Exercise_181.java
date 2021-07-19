package primus.pawel;

// Longest vowel chain
// 7kyu
// https://www.codewars.com/kata/59c5f4e9d751df43cf000035
// 2021-07-17 T:23:48:17
class Exercise_181 {

    public static int solve(String s) {

        int longestVowelSubstring = Integer.MIN_VALUE;
        int currentVowelSubstring = 0;

        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                currentVowelSubstring++;
            } else {
                if (currentVowelSubstring > longestVowelSubstring) {
                    longestVowelSubstring = currentVowelSubstring;
                }
                currentVowelSubstring = 0;
            }
        }

        if (currentVowelSubstring > longestVowelSubstring) {
            longestVowelSubstring = currentVowelSubstring;
        }
        return longestVowelSubstring;
    }


    public static boolean isVowel(char letter) {
        return letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u';
    }

}
