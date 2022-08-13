package primus.pawel;

import java.util.HashSet;
import java.util.stream.Collectors;

// See You Next Happy Year
// 7kyu
// https://www.codewars.com/kata/5ae7e3f068e6445bc8000046/train/java
// 2022-05-09 T:18:52:52
class Exercise_442 {

    static public int nextHappyYear(int year) {
        while (true){
            year++;
            if(isDiscintDigits(year)){
                return year;
            }
        }
    }

    private static boolean isDiscintDigits(int number){
        String strNumber  = String.valueOf(number);
        HashSet<Character> set = strNumber.chars().mapToObj(chr -> (char) chr) // autoboxed to Character
                .collect(Collectors.toCollection(HashSet::new));
        return set.size() == strNumber.length();
    }


}
