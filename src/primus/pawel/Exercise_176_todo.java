package primus.pawel;
// The Clockwise Spiral
// 5kyu
// https://www.codewars.com/kata/536a155256eb459b8700077e
// 2021-07-11 T:18:19:02
class Exercise_176_todo {

    public static int[][] createSpiral(int N) {
        int[][] spirale = new int[N][N];
        int currentValue = 1;
        int xDirection = 0;
        int yDirection = 0;
        int direction = 0;

        while (currentValue <= N*N){




        }


        for (int i = 0; i < spirale.length; i++) {
            for (int j = 0; j < spirale[i].length; j++) {
                System.out.println(spirale[i][j]);
            }
        }

        return null;
        // your code here
    }


    public static void main(String[] args) {
        createSpiral(5);
    }

}
