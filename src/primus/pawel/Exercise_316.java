package primus.pawel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Sum consecutives
// 6kyu
// https://www.codewars.com/kata/55eeddff3f64c954c2000059/train/java
// 2022-01-02 T:13:25:38
class Exercise_316 {
    public static List<Integer> sumConsecutives(List<Integer> s) {
        List<Integer> resultList = new ArrayList();
        int sumator = s.get(0);
        for (int i = 1; i < s.size(); i++) {
            if(!s.get(i).equals(s.get(i-1))){
                resultList.add(sumator);
                sumator = s.get(i);
            } else {
                sumator += s.get(i);
            }
        }
        resultList.add(sumator);
        return resultList;
    }

    public static void main(String[] args) {

        sumConsecutives(Arrays.asList(1, 4, 4, 4, 0, 4, 3, 3, 1));
    }
}
