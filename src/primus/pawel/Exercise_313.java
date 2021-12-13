package primus.pawel;
// Array - squareUp b!
// 7kyu
// https://www.codewars.com/kata/5a8bcd980025e99381000099/train/java
// 2021-12-13 T:20:30:39
class Exercise_313 {

    public static int[] squareUp(int n) {
        int[] result = new int[n*n];
        int index = 0;
        int blocker = n-2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j>blocker){
                    result[index] = n-j;
                }
                index++;
            }
            blocker--;
        }
        return result;
    }

    public static void main(String[] args) {
        squareUp(0);
    }
}
