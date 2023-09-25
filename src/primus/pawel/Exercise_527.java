package src.primus.pawel;

// Computer problem series #1: Fill the Hard Disk Drive
// 7kyu
// https://www.codewars.com/kata/5d49c93d089c6e000ff8428c/train/java
// 2023-09-25 T:19:43:43
public class Exercise_527 {

    public static int save(int[] sizes, int hd) {
        int result = 0;
        int sum =0;
        for (int num : sizes) {
            sum +=num;
            if(sum > hd){
                return result;
            }
            result++;
        }
        return result;
    }

}
