package primus.pawel;
// Beginner Series #3 Sum of Numbers
// 7kyu
// https://www.codewars.com/kata/55f2b110f61eb01779000053/train/java
// 2021-03-24 T:00:28:34
class Exercise_038 {

    public static int GetSum(int a, int b)
    {
        int sum = 0;
        if (a==b) return a;
        if(b < a) {
            int buf = a;
            a = b;
            b = buf;
        }

        for (int i = a; i <=b ; i++) {
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        GetSum(9,7);
    }
}

/*public int GetSum(int a, int b) {
       return IntStream.range(Math.min(a, b), Math.max(a, b) + 1).sum();
     }



     */
