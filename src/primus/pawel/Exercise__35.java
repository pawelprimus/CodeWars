package primus.pawel;

// Sudoku Solution Validator
// 4kyu
// https://www.codewars.com/kata/529bf0e9bdf7657179000008/train/java
// 2021-03-23 T:18:37:36
class Exercise__35 {
    public static boolean check(int[][] sudoku) {
        int[] horizontalCheckSum = new int[10];
        int[] verticalCheckSum = new int[10];
        int[] squareCheckSum_1 = new int[10];
        int[] squareCheckSum_2 = new int[10];
        int[] squareCheckSum_3 = new int[10];


        if (sudoku.equals(null)) {
            return false;
        } else {

            for (int i = 0; i < sudoku.length; i++) {
                for (int j = 0; j < sudoku.length; j++) {
                    horizontalCheckSum[sudoku[i][j]] = 1;
                    verticalCheckSum[sudoku[j][i]] = 1;
                }
                for (int j = 0; j < 3; j++) {
                    squareCheckSum_1[sudoku[i][j] ] = 1;
                    squareCheckSum_2[sudoku[i][j+3]] = 1;
                    squareCheckSum_3[sudoku[i][j+6]] = 1;
                }
                if(!arrayCheck(verticalCheckSum) || !arrayCheck(horizontalCheckSum)) return false;
                if ((i + 1) % 3 == 0) {
                    if(!arrayCheck(squareCheckSum_1) || !arrayCheck(squareCheckSum_2) || !arrayCheck(squareCheckSum_3) ) return false;
                    squareCheckSum_1 = new int[10];
                    squareCheckSum_2 = new int[10];
                    squareCheckSum_3 = new int[10];
                }
                horizontalCheckSum = new int[10];
                verticalCheckSum = new int[10];
            }

        }
        return true;
    }

    public static boolean arrayCheck(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] != 1) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        int[][] sudoku = {
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}
        };

        sudoku[0][0]++;
        sudoku[1][1]++;
        sudoku[0][1]--;
        sudoku[1][0]--;

        sudoku[0][0]--;
        sudoku[1][1]--;
        sudoku[0][1]++;
        sudoku[1][0]++;

        sudoku[4][4] = 0;

        System.out.println(check(sudoku));
    }

}
