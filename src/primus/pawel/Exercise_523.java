package src.primus.pawel;

// Cats and shelves
// 7kyu
// https://www.codewars.com/kata/62c93765cef6f10030dfa92b/train/java
// 2023-08-31 T:23:14:23
public class Exercise_523 {

    public static int solution(int start, int finish) {
        int all = finish - start;
        return all / 3 + all % 3;
    }

}
