package primus.pawel;

// Simple string division
// 7kyu
// https://www.codewars.com/kata/5b83c1c44a6acac33400009a/train/java
// 2022-03-04 T:01:08:45
class Exercise_389 {

    public static long solve(String st, int k) {
        int numberLength = st.length() - k;

        long max = Long.MIN_VALUE;
        for (int i = 0; i <= st.length() - numberLength; i++) {
            long loopNumber = Long.parseLong(st.substring(i, i + numberLength));
            System.out.println(st.substring(i, i + numberLength));
            if (max < loopNumber) {
                max = loopNumber;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        solve("123", 1);
//        solve("12345678", 2);
//        solve("12345678", 3);
//        solve("12345678", 4);
//        solve("12345678", 5);
    }

}
