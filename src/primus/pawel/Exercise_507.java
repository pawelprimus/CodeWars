package src.primus.pawel;

import java.util.Arrays;

// The 'spiraling' box
// 7kyu
// https://www.codewars.com/kata/63b84f54693cb10065687ae5/train/java
// 2023-02-07 T:21:32:27
public class Exercise_507 {

    public static int[][] createBox(int width, int length){
        int[][] output = new int[length][width];
        for(int i = 0; i < width; i++){
            for(int j = 0; j < length; j++){
                output[j][i] = Math.min((Math.min((i + 1), width - i )),(Math.min((j + 1), (length - j))));
            }
        }
        return output;
    }

    public static void main(String[] args) {

        int result[][] = createBox(7, 8);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " | ");
            }
            System.out.println();
        }
    }

}
