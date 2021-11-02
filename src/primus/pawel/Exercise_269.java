package primus.pawel;
// Sum of Cubes
// 7kyu
// https://www.codewars.com/kata/59a8570b570190d313000037/train/java
// 2021-11-02 T:21:03:41
class Exercise_269 {

    public static long sumCubes(long n)
    {
        System.out.println(n);
        long  sum = 0;
        while (n>0){
            sum += n*n*n;
            n--;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumCubes(18745));
    }
}
