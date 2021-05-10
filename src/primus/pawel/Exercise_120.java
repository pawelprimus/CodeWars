package primus.pawel;

// Over The Road
// 7kyu
// https://www.codewars.com/kata/5f0ed36164f2bc00283aed07/train/java
// 2021-05-10 T:21:01:09
class Exercise_120 {
    public static long overTheRoad(long address, long n) {
        return (address % 2 == 1) ? n*2 - address+1 :  n*2 -address +1;
    }

    public static void main(String[] args) {
        System.out.println(overTheRoad(4,6));
    }
}

/*
1   12          1  6
3   10          3  4
5    8          5  2
7    6
9    4
11   2
*/
