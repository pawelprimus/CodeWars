package primus.pawel;
/*-----4kyu
https://www.codewars.com/kata/521c2db8ddc89b9b7a0000c1/train/java*/

class Exercise_019 {
    public static int[] snail(int[][] array) {
        if (array[0].length <= 0) {
            return new int[0];
        }

        int[] result = new int[(int) Math.pow(array.length, 2)];

        int resultIterator = 0;

        char dir = 'd';
        int xDirection = 1;
        int yDirection = -1;
        int x = array.length - 1;
        int y = 0;
        int length = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            result[resultIterator] = array[0][i];
            resultIterator++;
            System.out.println(array[0][i]);
        }

        //for (int i = 0; i < array.length + 4; i++) {

        while (length > 0) {

            if (dir == 'h') {
                for (int j = 0; j < length; j++) {
                    x = x - xDirection;
                    result[resultIterator] = array[y][x];
                    resultIterator++;
                    System.out.println(array[y][x]);
                }
                xDirection *= -1;
                dir = 'd';
                length--;
            } else {
                for (int j = 0; j < length; j++) {
                    y = y - yDirection;
                    result[resultIterator] = array[y][x];
                    resultIterator++;
                    System.out.println(array[y][x]);
                }
                yDirection *= -1;
                dir = 'h';
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[][] array
                = {{773, 571, 106, 780, 744, 492, 914, 973},
                {387, 997, 771, 573, 303, 230, 217, 408},
                {945, 509, 221, 589, 929, 378, 250, 92},
                {849, 960, 663, 380, 528, 545, 170, 899},
                {616, 501, 813, 33, 417, 692, 7, 131},
                {279, 403, 96, 513, 890, 137, 7, 677},
                {590, 60, 779, 987, 719, 947, 535, 962},
                {826, 840, 336, 723, 795, 622, 568, 380}
        };

        int[][] array2
                = {};

        System.out.println(snail(array));

    }

}
