package primus.pawel;

import java.util.ArrayList;
import java.util.List;

// Is my friend cheating?
// 5kyu
// https://www.codewars.com/kata/5547cc7dcad755e480000004
// 2021-04-28 T:20:34:07
class Exercise_074_todo {

    public static List<long[]> removNb(long n) {
        List<long[]> resultList = new ArrayList<>(){};
        final long sumOfAll = n * (n + 1) / 2;
        double num;
        for (int i = 0; i < n; i++) {

            num  = (sumOfAll -i) / (double)(i+1);
            if(num<=n && num% 1 == 0){
                resultList.add(new long[]{i,(long) num});
            }
        }
        return resultList;
    }

    public static void main(String[] args) {

        System.out.println(removNb(26));
    }


}
