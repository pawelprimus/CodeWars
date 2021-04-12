package primus.pawel;

// Fake Binary
// 8kyu
// https://www.codewars.com/kata/57eae65a4321032ce000002d/train/java
// 2021-04-12 T:20:37:31
class Exercise_072 {
    public static String fakeBin(String numberString) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numberString.length(); i++) {
            if (numberString.charAt(i) < 53) {
                result.append("0");
            } else {
                result.append("1");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(fakeBin("0123456789"));
    }
/*return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
 public static String fakeBin(String numberString) {
        final char c[] = numberString.toCharArray();
        for (int i = 0; i < c.length; i++)
          c[i] = c[i] < '5' ? '0' : '1';
        return new String(c);
    }
* */

}
