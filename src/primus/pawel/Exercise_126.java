package primus.pawel;

// Data reverse
// 6kyu
// https://www.codewars.com/kata/569d488d61b812a0f7000015/train/java
// 2021-05-15 T:13:06:19
class Exercise_126 {
    public static int[] DataReverse(int[] data) {

        int[] reversedData = new int[data.length];
        int dataIterator = 0;
        for (int i = data.length; i > 0; i = i - 8) {
            for (int j = 8; j > 0; j--) {
                reversedData[dataIterator] = data[(i - ((j + 7) % 8) - 1)];
                dataIterator++;
            }
        }
        return reversedData;
    }

    public static void main(String[] args) {
        int[] data2 = {1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1};
        DataReverse(data2);
    }
}
