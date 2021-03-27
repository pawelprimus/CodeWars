package primus.pawel;

// Consecutive strings
// 6kyu
// https://www.codewars.com/kata/56a5d994ac971f1ac500003e/train/java
// 2021-03-24 T:20:03:33
class Exercise_041 {

    public static String longestConsec(String[] strarr, int k) {

        int concatMaxIndex = 0;
        int concatCurrent = 0;
        int concatMax = 0;
        if (strarr.length < k || k <= 0) return "";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < k; i++) { // getting length of first concatenation of "k" strings
            concatCurrent += strarr[i].length();
            concatMax = concatCurrent;
        }

        for (int i = 0; i < strarr.length - k; i++) {

            concatCurrent = concatCurrent - strarr[i].length() + strarr[i + k].length(); // subtaction last length of str and adding next

            if (concatCurrent > concatMax) {
                concatMax = concatCurrent;
                concatMaxIndex = i + 1;
            }

        }

        for (int i = concatMaxIndex; i < concatMaxIndex + k; i++) { // making result from array, starting with index we get
            result.append(strarr[i]);
        }

        //System.out.println("concat Max: " + concatMax );
        //System.out.println("concat Max index: " + concatMaxIndex );

        return result.toString();
    }

    public static void main(String[] args) {

        String[] arrStr = {"tree", "foling", "trashy", "blue", "abcdef", "uvwxyz"};
        System.out.println(longestConsec(arrStr, 2));


    }

}
