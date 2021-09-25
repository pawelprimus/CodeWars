package primus.pawel;

// max diff - easy
// 7kyu
// https://www.codewars.com/kata/588a3c3ef0fbc9c8e1000095/train/java
// 2021-09-25 T:13:50:43
class Exercise_235 {

    public static int maxDiff(int[] lst) {
        if (lst.length < 2) {
            return 0;
        }
        int biggestNumber = Integer.MIN_VALUE;
        int smallestNumber = Integer.MAX_VALUE;

        for (int i = 0; i < lst.length; i++) {

            if (lst[i] > biggestNumber) {
                biggestNumber = lst[i];
            }

            if (lst[i] < smallestNumber) {
                smallestNumber = lst[i];
            }

        }
        return biggestNumber - smallestNumber;
    }
}

/* public static int maxDiff(int[] lst) {
    return lst.length == 0 ? 0 :
      Arrays.stream(lst).max().getAsInt() - Arrays.stream(lst).min().getAsInt();
  }
  */