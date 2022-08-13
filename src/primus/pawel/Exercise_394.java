package primus.pawel;

import java.util.stream.IntStream;

// Letterbox Paint-Squad
// 7kyu
// https://www.codewars.com/kata/597d75744f4190857a00008d/train/java
// 2022-03-10 T:21:55:59
class Exercise_394 {

    public static int[] paintLetterboxes(final int start, final int end) {
        int[] result = new int[10];

        IntStream.rangeClosed(start, end).forEach(i ->{
            String strNum = String.valueOf(i);
            for (int j = 0; j < strNum.length(); j++) {
                result[strNum.charAt(j) - 48]++;
            }
        });
        return result;
    }

    public static void main(String[] args) {
        paintLetterboxes(10, 77);
    }


}
