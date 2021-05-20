package primus.pawel;

// longest_palindrome
// 6kyu
// https://www.codewars.com/kata/54bb6f887e5a80180900046b/train/java
// 2021-04-19 T:22:09:03
class Exercise_083 {

    public static int longestPalindrome(final String s) {
        int longestPalindromeLength = s.length();
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j <= i; j++) {
                //System.out.print(s.substring(j,longestPalindromeLength + j) + " ");
                if (checkIfPalindrome((s.substring(j, longestPalindromeLength + j))))
                    return longestPalindromeLength;
            }
            //System.out.println("longestPalindromeLength: " + longestPalindromeLength);
            //System.out.println();
            longestPalindromeLength--;
        }
        return 0; //your code here
    }

    public static boolean checkIfPalindrome(final String s) {
        if (s.length() == 1) return true;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        longestPalindrome("abcdf");
    }

}
