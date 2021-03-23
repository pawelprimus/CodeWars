package primus.pawel;
// Tribonacci Sequence
// 6kyu
// https://www.codewars.com/kata/556deca17c58da83c00002db/train/java
// 2021-03-22 T:20:14:36
class Exercise_034 {

    public double[] tribonacci(double[] s, int n) {


        double[] result = new double[n];
        if(n > 0) result[0] = s[0];
        if(n > 1) result[1] = s[1];
        if(n > 2) result[2] = s[2];


        for (int i = 3; i < n; i++) {
            result[i] = result[i-1] + result[i-2] + result[i-3];
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
