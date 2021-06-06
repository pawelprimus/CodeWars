package primus.pawel;

// Calculate String Rotation
// 6kyu
// https://www.codewars.com/kata/5596f6e9529e9ab6fb000014/train/java
// 2021-06-06 T:14:03:00
class Exercise_149 {

    static int shiftedDiff(String first, String second) {

        StringBuilder sb = new StringBuilder(first);
        int result = 0;
        while (result < first.length()) {

            if (sb.toString().equals(second)) {
                return result;
            }
            result++;
            sb = new StringBuilder().append(sb.charAt(sb.length() - 1)).append(sb.deleteCharAt(sb.length() - 1));
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(shiftedDiff("coffee", "eecoff"));
    }

}
