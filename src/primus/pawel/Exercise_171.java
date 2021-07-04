package primus.pawel;

// Longest alphabetical substring
// 6kyu
// https://www.codewars.com/kata/5a7f58c00025e917f30000f1/train/java
// 2021-07-04 T:14:04:44
class Exercise_171 {

    public static String longestAlpabeticalSubstring(String text) {
        int startAlpOrder = 0;
        int endAlpOrder = 1;
        int longestAlpSubstring = 1;
        int currentAlpSubstring = 1;

        for (int i = 1; i < text.length(); i++) {

            if ( text.charAt(i) >=  text.charAt(i - 1)) {
                currentAlpSubstring++;
            } else {

                if (currentAlpSubstring > longestAlpSubstring) {
                    longestAlpSubstring = currentAlpSubstring;
                    startAlpOrder = i - currentAlpSubstring;
                    endAlpOrder = i;
                }
                currentAlpSubstring = 1;
            }

            if (i == text.length() - 1) { // check in last iteration if currents is > than longest
                if (currentAlpSubstring > longestAlpSubstring) {
                    startAlpOrder = i - currentAlpSubstring + 1;
                    endAlpOrder = i + 1;
                }
            }
        }

        return text.substring(startAlpOrder, endAlpOrder);
    }

    public static void main(String[] args) {

        System.out.println(longestAlpabeticalSubstring("nab"));
    }


}
