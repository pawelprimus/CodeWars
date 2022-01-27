package primus.pawel;

// CubeSummation
// 7kyu
// https://www.codewars.com/kata/550e9fd127c656709400024d/train/java
// 2022-01-27 T:00:58:29
class Exercise_352 {

    public static long cubeSum(int n, int m) {

        int biggerNum;
        int smallerNum;
        long sum = 0;
        if (n == m) {
            return 0;
        }

        smallerNum = Math.min(n, m);
        biggerNum = Math.max(n, m);
        sum = java.util.stream.LongStream.range(smallerNum + 1, biggerNum).map(i -> (long) Math.pow(i, 3)).sum();

//        if (n > m) {
//            biggerNum = n;
//            smallerNum = m;
//
//        } else {
//            biggerNum = m;
//            smallerNum = n;
//        }
//        for (int i = smallerNum + 1; i <= biggerNum; i++) {
//
//            sum += Math.pow(i, 3);
//
//        }
        return sum;
    }
}
