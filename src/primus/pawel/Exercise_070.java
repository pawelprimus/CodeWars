package primus.pawel;
// Convert a String to a number
// 8kyu
// https://www.codewars.com/kata/544675c6f971f7399a000e79/train/java
// 2021-04-12 T:20:29:08
class Exercise_070 {

    public static int stringToNumber(String str) {
        return Integer.valueOf(str);
    }
}

/*return Integer.parseInt(str);
* try {
    return Integer.parseInt(str);
    } catch (NumberFormatException NFE) {
      throw NFE;
    }
* */
