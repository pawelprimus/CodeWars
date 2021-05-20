package primus.pawel;

import java.util.ArrayList;
import java.util.Collections;

// Which are in?
// 6kyu
// https://www.codewars.com/kata/550554fd08b86f84fe000a58/train/java
// 2021-04-11 T:21:06:49
class Exercise_068 {

    public static String[] inArray(String[] array1, String[] array2) {

        ArrayList<String> resultArray = new ArrayList<>();
        //ArrayList<String> array2ArrList = new ArrayList<>(Arrays.asList(array2));
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array2[j].contains(array1[i])) {
                    if (!resultArray.contains(array1[i])) resultArray.add(array1[i]);
                    j = array2.length;
                }
            }
        }
        Collections.sort(resultArray);
        return resultArray.toArray(new String[0]);
    }

}
