package primus.pawel;

// Largest 5 digit number in a series
// 7kyu
// https://www.codewars.com/kata/51675d17e0c1bed195000001/train/java
// 2021-06-02 T:23:11:47
class Exercise_145 {

    public static int solve(final String digits) {

        StringBuilder sbDigits = new StringBuilder(digits);
        if (sbDigits.length() <= 5) {
            return Integer.parseInt(sbDigits.toString());
        }
        int maxInt = Integer.parseInt(sbDigits.subSequence(0, 5).toString());

        int tempInt = 0;

        for (int i = 1; i <= sbDigits.length() - 5; i++) {
            tempInt = Integer.parseInt(sbDigits.subSequence(i, i + 5).toString());
            if(tempInt > maxInt){
                maxInt = tempInt;
            }
        }

        return maxInt; // you code here
    }

    public static void main(String[] args) {

        solve("123456789");
    }

}
