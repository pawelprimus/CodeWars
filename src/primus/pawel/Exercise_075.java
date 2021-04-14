// Don't give me five!
// 7kyu
// https://www.codewars.com/kata/5813d19765d81c592200001a/train/java
// 2021-04-13 T:20:00:41
package primus.pawel;

class Exercise_075 {
    public static int dontGiveMeFive(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (!String.valueOf(i).contains("5")) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        dontGiveMeFive(4, 26);
    }

}
// return IntStream.rangeClosed(start, end).filter(x -> !String.valueOf(x).matches(".*5.*")).count();