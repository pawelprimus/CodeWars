package primus.pawel;
// Palindrome chain length
// 7kyu
// https://www.codewars.com/kata/525f039017c7cd0e1a000a26/train/java
// 2021-05-18 T:19:47:40
class Exercise_130 {

    public static int palindromeChainLength (long n) {
        StringBuilder sbNumer = new StringBuilder(String.valueOf(n));
        int result = 0;
        long normalNum = n;
        long reversedNum = n;
        while (!isPalindrome(sbNumer.toString())){
            result++;
            normalNum = Long.parseLong(sbNumer.toString());
            reversedNum = Long.parseLong(sbNumer.reverse().toString());
             sbNumer = new StringBuilder(String.valueOf(normalNum + reversedNum));
        }
        return result;
    }

    public static boolean isPalindrome(String num){
        for (int i = 0; i < num.length()/2; i++) {
            if(num.charAt(i) != num.charAt(num.length()-1 - i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        palindromeChainLength(2);
        System.out.println(isPalindrome("123322"));
    }

}


