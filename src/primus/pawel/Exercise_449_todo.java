package primus.pawel;

import java.util.Arrays;

// Build Tower
// 6kyu
// https://www.codewars.com/kata/576757b1df89ecf5bd00073b/train/java
// 2022-05-13 T:18:24:45
class Exercise_449_todo {

    private static final String STAR = "*";
    private static final String SPACE = " ";

    public static String[] towerBuilder(int nFloors) {
        if (nFloors < 1) {
            return new String[0];
        }
        String[] result = new String[nFloors];
        int i = 1;
        while (i <= nFloors) {
            final String floor = 
                    SPACE.repeat(nFloors - i) +
                    STAR.repeat(i * 2 - 1) +
                    SPACE.repeat(nFloors - i);
            result[i - 1] = floor;
            i++;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(String.join(",", "  *  ", " *** ", "*****"));
        Arrays.stream(towerBuilder(6)).forEach(System.out::print);
    }
}
