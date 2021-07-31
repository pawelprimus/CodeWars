package primus.pawel;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Responsible Drinking
// 7kyu
// https://www.codewars.com/kata/5aee86c5783bb432cd000018/train/java
// 2021-07-31 T:18:23:15
class Exercise_192 {
    public static String hydrate(String drinkString) {
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(drinkString);
        int glassesOfWater = 0;
        while (matcher.find()) {
            glassesOfWater += Integer.parseInt(matcher.group());
        }

        return glassesOfWater<=1 ? glassesOfWater + " glass of water" : glassesOfWater + " glasses of water";
    }


}
