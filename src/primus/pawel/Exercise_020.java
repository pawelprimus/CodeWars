package primus.pawel;

// Counting Duplicates
// 6kyu
// https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1/train/java
// 2021-03-16 T:18:21:44
class Exercise_020 {

    public static int duplicateCount(String text) {
        text = text.toUpperCase();
        int result = 0;
        int[] resultTab = new int[126];
        for (int i = 0; i < text.length(); i++) {
            //System.out.println((int)text.charAt(i));
            resultTab[(int) text.charAt(i)]++;
        }

        for (int value : resultTab) {
            if (value > 1) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(duplicateCount("indivisibility"));

    }


}
