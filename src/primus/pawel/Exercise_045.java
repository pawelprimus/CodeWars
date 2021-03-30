package primus.pawel;

// Credit Card Mask
// 7kyu
// https://www.codewars.com/kata/5412509bd436bd33920011bc/train/java
// 2021-03-30 T:22:54:35
class Exercise_045 {

    public static String maskify(String str) {

        final int STRLENGTH = str.length();
        if (STRLENGTH <= 4) {
            return str;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("#".repeat(STRLENGTH - 4));
            sb.append(str.substring(STRLENGTH - 4, STRLENGTH));
            return sb.toString();
        }
    }

    public static void main(String[] args) {

        maskify("4556364607935616");
    }
}
/*  public static String maskify(String str) {
        return str.replaceAll(".(?=.{4})", "#");
    }
  public static String maskify(String str) {
        return str.length()<=4 ? str : str.substring(0,str.length()-4).replaceAll(".","#") + str.substring(str.length()-4);
    }



    */