package primus.pawel;

import org.junit.platform.commons.util.StringUtils;

// C.Wars
// 7kyu
// https://www.codewars.com/kata/55968ab32cf633c3f8000008/train/java
// 2022-05-09 T:19:31:54
class Exercise_445 {


    public static String initials(String name) {
        String[] names = name.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < names.length - 1; i++) {
            result.append(Character.toUpperCase(names[i].charAt(0))).append(".");
        }

        return result.toString() + capitalize(names[names.length -1]);
    }

    public static String capitalize(String str)
    {
        if(str == null) return str;
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }


}
