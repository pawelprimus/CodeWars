package primus.pawel;

// Simple string reversal II
// 7kyu
// https://www.codewars.com/kata/5a8d1c82373c2e099d0000ac/train/java
// 2022-03-22 T:19:54:10
class Exercise_401 {

    public static String solve(String s, int a, int b) {
        if (b > s.length()) {
            StringBuilder toRevers = new StringBuilder(s.substring(a, s.length()));
            return s.substring(0, a) + toRevers.reverse().toString();
        } else {
            StringBuilder toRevers = new StringBuilder(s.substring(a, b + 1));
            return s.substring(0, a) + toRevers.reverse().toString() + s.substring(b + 1);
        }
    }


}
