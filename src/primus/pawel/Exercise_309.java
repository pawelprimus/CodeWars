package primus.pawel;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Correct the time-string
// 7kyu
// https://www.codewars.com/kata/57873ab5e55533a2890000c7/train/java
// 2021-12-30 T:20:34:30
class Exercise_309 {

    private static final String TIME24HOURS_PATTERN = "[0-9][0-9]:[0-9][0-9]:[0-9][0-9]";

    public static String timeCorrect(String timestring) {


        if (timestring == null || timestring.length() != 8) {
            return null;
        }
        if (!validate(timestring)) {
            return null;
        }

        String result = "%02d:%02d:%02d";
        String[] time = timestring.split(":");
        int hours = Integer.parseInt(time[0]);
        int minutes = Integer.parseInt(time[1]);
        int seconds = Integer.parseInt(time[2]);


        if (seconds >= 60) {
            minutes++;
            seconds = seconds % 60;
        }
        if (minutes >= 60) {
            hours++;
            minutes = minutes % 60;
        }
        if (hours >= 24) {
            hours = hours % 24;
        }
        return String.format(result, hours, minutes, seconds);
    }

    public static boolean validate(final String time) {
        Pattern pattern = Pattern.compile(TIME24HOURS_PATTERN);
        Matcher matcher = pattern.matcher(time);
        return matcher.matches();
    }

    public static void main(String[] args) {
        System.out.println(timeCorrect("11:70:10"));
    }
}
