package primus.pawel;
// Remove First and Last Character
// 8kyu
// https://www.codewars.com/kata/56bc28ad5bdaeb48760009b0/train/java
// 2021-04-01 T:21:25:26
class Exercise_050 {

    public static String remove(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.deleteCharAt(0);
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }

}

/* public static String remove(String str) {
        return str.substring(1, str.length() - 1);
    }


    public static String remove(String str) {

       return str.replaceAll("^.|.$", "");

    }

(. regex)Matches any character
(^ regex)Finds regex that must match at the beginning of the line.
($ regex)Finds regex that must match at the end of the line.
(| regex) or regex
^.|.$ the first part(^.) find the first char and replace it with empty String (replaceAll function)
the second part (|.$) means find the last char and replace it with empty "" (replaceAll function )
so suppose that the String is CodeWars , first char is C(^.) And last is s(.$) and replaceAll function will replace it with empty String

    */
