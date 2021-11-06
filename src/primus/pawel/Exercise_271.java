package primus.pawel;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Filter the number
// 7kyu
// https://www.codewars.com/kata/55b051fac50a3292a9000025/train/java
// 2021-11-06 T:10:59:38
class Exercise_271 {

    public static long filterString(final String value) {
        StringBuilder stringBuilder = new StringBuilder();
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(value);
        while (matcher.find()){
            stringBuilder.append(matcher.group());
        }
        return Long.parseLong(stringBuilder.toString());
        /*It's better to use Long#parseLong instead of Long#valueOf.
        That's because parseLong method returns long and valueOf method wraps the result in Long class,
         then the method unwraps it (which obviously is redundant).*/
    }
}

/*public static long filterString(final String value) {
        return Long.valueOf(value.replaceAll("\\D", ""));
    }*/