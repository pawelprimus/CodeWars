package primus.pawel;

import java.util.Arrays;

// Highest and Lowest
// 7kyu
// https://www.codewars.com/kata/554b4ac871d6813a03000035/train/java
//
class Exercise_013 {

    public static String highAndLow(String numbers) {

        int lowest = Integer.MAX_VALUE;
        int highest = Integer.MIN_VALUE;
        numbers += " ";
        StringBuilder sB = new StringBuilder("");

        for (int i = 0; i < numbers.length(); i++) {
            if (numbers.charAt(i) == ' ') {
                //System.out.println("");
                // System.out.println(sB.toString());
                if (Integer.parseInt(sB.toString()) < lowest) {
                    lowest = Integer.parseInt(sB.toString());
                }
                if (Integer.parseInt(sB.toString()) > highest) {
                    highest = Integer.parseInt(sB.toString());
                }
                sB.delete(0, sB.length());
            } else {
                //System.out.print(numbers.charAt(i));
                sB.append(numbers.charAt(i));
            }
        }
        //System.out.println(highest);
        //System.out.println(lowest);
        return highest + " " + lowest;
    }

    public static void main(String[] args) {
        System.out.println(highAndLow2("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }

    public static String highAndLow2(String numbers) {
        String[] dividedNumbers = numbers.split("[ ]");
        StringBuilder sbResult = new StringBuilder();
        sbResult.append(Arrays.stream(dividedNumbers).mapToInt(Integer::parseInt).max().orElse(-1))
        .append(" ");
        sbResult.append(Arrays.stream(dividedNumbers).mapToInt(Integer::parseInt).min().orElse(-1));
        return sbResult.toString();
    }
}
