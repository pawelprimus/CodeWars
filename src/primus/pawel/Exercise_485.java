package src.primus.pawel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// All Inclusive?
// 7kyu
// https://www.codewars.com/kata/5700c9acc1555755be00027e/train/java
// 2023-05-13 T:08:52:14
public class Exercise_485 {

    public static boolean containAllRots(String strng, List<String> arr) {
        List<String> strngRotations = getRotations(strng);

        for (String rotation : strngRotations) {
            if (!arr.contains(rotation)) {
                return false;
            }
        }
        return true;
    }

    public static List<String> getRotations(String str) {
        List<String> rotations = new ArrayList<>();
        String rotation = str;
        for (int i = 0; i < str.length(); i++) {
            rotation = rotation.substring(1, str.length()) + rotation.charAt(0);
            rotations.add(rotation);
        }
        return rotations;
    }


    public static void main(String[] args) {
        List<String> arr = Arrays.asList("bsjq", "qbsj", "sjqb", "twZNsslC", "jqbs");
        System.out.println(containAllRots("bsjq", arr));
    }

}
