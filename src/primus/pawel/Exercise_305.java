package primus.pawel;

// Basic Sequence Practice
// 7kyu
// https://www.codewars.com/kata/5436f26c4e3d6c40e5000282/train/java
// 2021-12-05 T:16:13:15
class Exercise_305 {

    public static int[] sumOfN(int n) {
        int newN = n;
        int signum;
        if (n > 0) {
            signum = 1;
        } else {
            signum = -1;
            newN = n * -1;
        }
        int[] result = new int[newN + 1];
        result[0] = 0;
        for (int i = 1; i < newN + 1; i++) {
            result[i] = result[i - 1] + i * signum;
            System.out.println(result[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        sumOfN(0);
    }

}

/*
  int sign = (int) Math.signum(n);
*/
