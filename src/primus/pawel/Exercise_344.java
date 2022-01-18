package primus.pawel;

// Sum of Triangular Numbers
// 7kyu
// https://www.codewars.com/kata/580878d5d27b84b64c000b51/train/java
// 2022-01-18 T:22:08:52
class Exercise_344 {

    public static int sumTriangularNumbers(int n) {
        if (n < 1) {
            return 0;
        }
        int result = 0;
        int loop = 0;
        for (int i = 1; i <= n; i++) {
            loop += i;
            result += loop;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sumTriangularNumbers(6));
    }
}

/*  public static int sumTriangularNumbers(int n) {
    return IntStream.rangeClosed(1, n).map(num -> num * (num + 1) / 2).sum();
  }*/