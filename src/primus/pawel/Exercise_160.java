package primus.pawel;

import java.util.HashMap;
import java.util.Map;

// Read The time
// 6kyu
// https://www.codewars.com/kata/5c2b4182ac111c05cf388858/train/java
// 2021-06-17 T:21:04:21
class Exercise_160 {

    public static String solve(String time) {

        final String oClock = " o'clock";

        String[] hourAndMinute = time.split(":");
        int hours = Integer.parseInt(hourAndMinute[0]);
        int minutes = Integer.parseInt(hourAndMinute[1]);

        if(hours == 0 && minutes == 0){
            return hoursToWord(hours);
        }

        if(minutes == 0){
            return hoursToWord(hours) + oClock;
        }

        if(minutes<=30){
            return minutesToWord(minutes) + " " + hoursToWord(hours);
        }

        if(minutes>30){
            return minutesToWord(minutes) + " " + hoursToWord(hours + 1);
        }

        return "";
    }

    public static String hoursToWord(Integer number) {
        HashMap<Integer, String> wordsMap = new HashMap<>();
        wordsMap.put(1,"one");
        wordsMap.put(2,"two");
        wordsMap.put(3,"three");
        wordsMap.put(4,"four");
        wordsMap.put(5,"five");
        wordsMap.put(6,"six");
        wordsMap.put(7,"seven");
        wordsMap.put(8,"eight");
        wordsMap.put(9,"nine");
        wordsMap.put(10, "ten");
        wordsMap.put(11,"eleven");
        wordsMap.put(12,"twelve");
        wordsMap.put(13,"one");
        wordsMap.put(14,"two");
        wordsMap.put(15,"three");
        wordsMap.put(16,"four");
        wordsMap.put(17,"five");
        wordsMap.put(18,"six");
        wordsMap.put(19,"seven");
        wordsMap.put(20,"eight");
        wordsMap.put(21,"nine");
        wordsMap.put(22,"ten");
        wordsMap.put(23,"eleven");
        wordsMap.put(0,"midnight");
        wordsMap.put(24,"midnight");

        return wordsMap.get(number);
    }

    public static String minutesToWord(Integer number) {

        HashMap<String, Integer> wordsMap = new HashMap<>();
        wordsMap.put("one minute past", 1);
        wordsMap.put("two minutes past", 2);
        wordsMap.put("three minutes past", 3);
        wordsMap.put("four minutes past", 4);
        wordsMap.put("five minutes past", 5);
        wordsMap.put("six minutes past", 6);
        wordsMap.put("seven minutes past", 7);
        wordsMap.put("eight minutes past", 8);
        wordsMap.put("nine minutes past", 9);
        wordsMap.put("ten minutes past", 10);
        wordsMap.put("eleven minutes past", 11);
        wordsMap.put("twelve minutes past", 12);
        wordsMap.put("thirteen minutes past", 13);
        wordsMap.put("fourteen minutes past", 14);
        wordsMap.put("quarter past", 15);
        wordsMap.put("sixteen minutes past", 16);
        wordsMap.put("seventeen minutes past", 17);
        wordsMap.put("eighteen minutes past", 18);
        wordsMap.put("nineteen minutes past", 19);
        wordsMap.put("twenty minutes past", 20);
        wordsMap.put("twenty one minutes past", 21);
        wordsMap.put("twenty two minutes past", 22);
        wordsMap.put("twenty three minutes past", 23);
        wordsMap.put("twenty four minutes past", 24);
        wordsMap.put("twenty five minutes past", 25);
        wordsMap.put("twenty six minutes past", 26);
        wordsMap.put("twenty seven minutes past", 27);
        wordsMap.put("twenty eight minutes past", 28);
        wordsMap.put("twenty nine minutes past", 29);
        wordsMap.put("half past", 30);
        wordsMap.put("twenty nine minutes to", 31);
        wordsMap.put("twenty eight minutes to", 32);
        wordsMap.put("twenty seven minutes to", 33);
        wordsMap.put("twenty six minutes to", 34);
        wordsMap.put("twenty five minutes to", 35);
        wordsMap.put("twenty four minutes to", 36);
        wordsMap.put("twenty three minutes to", 37);
        wordsMap.put("twenty two minutes to", 38);
        wordsMap.put("twenty one minutes to", 39);
        wordsMap.put("twenty to", 40);
        wordsMap.put("nineteen minutes to", 41);
        wordsMap.put("eighteen minutes to", 42);
        wordsMap.put("seventeen minutes to", 43);
        wordsMap.put("sixteen minutes to", 44);
        wordsMap.put("quarter to", 45);
        wordsMap.put("fourteen minutes to", 46);
        wordsMap.put("thirteen minutes to", 47);
        wordsMap.put("twelve minutes to", 48);
        wordsMap.put("eleven minutes to", 49);
        wordsMap.put("ten minutes to", 50);
        wordsMap.put("nine minutes to", 51);
        wordsMap.put("eight minutes to", 52);
        wordsMap.put("seven minutes to", 53);
        wordsMap.put("six minutes to", 54);
        wordsMap.put("five minutes to", 55);
        wordsMap.put("four minutes to", 56);
        wordsMap.put("three minutes to", 57);
        wordsMap.put("two minutes to", 58);
        wordsMap.put("one minute to", 59);

        return getKey(wordsMap, number);
    }

    public static <K, V> K getKey(Map<K, V> map, V value) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (value.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(solve("12:48"));
    }


}

/*  static final String H[] = "midnight,one,two,three,four,five,six,seven,eight,nine,ten,eleven,twelve,one,two,three,four,five,six,seven,eight,nine,ten,eleven,midnight".split(",");
  static final String M[] = "o'clock,one,two,three,four,five,six,seven,eight,nine,ten,eleven,twelve,thirteen,fourteen,quarter,sixteen,seventeen,eighteen,nineteen,twenty,twenty one,twenty two,twenty three,twenty four,twenty five,twenty six,twenty seven,twenty eight,twenty nine,half".split(",");

  public static String solve(String time) {
    String parts[] = time.split(":");
    int h = Integer.valueOf(parts[0]), m = Integer.valueOf(parts[1]);
    String mins = m % 15 == 0 ? "" : m == 1 || m == 59 ? " minute" : " minutes";
    return  h + m == 0 ? String.format("%s", H[h]) :
            m == 0 ?     String.format("%s %s", H[h], M[m]) :
            m <= 30 ?    String.format("%s%s past %s", M[m], mins, H[h]) :
                         String.format("%s%s to %s", M[60-m], mins, H[h+1]);
    }*/
