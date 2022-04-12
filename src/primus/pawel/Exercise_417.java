package primus.pawel;

// Integer depth
// 6kyu
// https://www.codewars.com/kata/59b401e24f98a813f9000026/train/java
// 2022-04-12 T:19:15:47
class Exercise_417 {

    public static int computeDepth(int n) {
        int result = 1;
        String number;
        boolean[] checkedNumbers = new boolean[10];
        while (true) {
            number = String.valueOf(n * result);
            number.chars().forEach(i -> checkedNumbers[i - 48] = true);
            if (isAllTrue(checkedNumbers)) {
                return result;
            }
            result++;
        }
    }

    public static boolean isAllTrue(boolean[] boolArray) {
        for (boolean bool : boolArray) {
            if (!bool) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(computeDepth(42));
    }
}
