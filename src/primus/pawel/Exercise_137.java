package primus.pawel;

// shorter concat [reverse longer]
// 7 kyu
// https://www.codewars.com/kata/54557d61126a00423b000a45/train/java
// 2021-05-26 T:20:53:29
class Exercise_137 {

    public static String shorterReverseLonger(String a, String b) {
        StringBuilder rev = new StringBuilder();
        StringBuilder result = new StringBuilder();
        if (a.length() >= b.length()) {
            rev.append(a).reverse();
            result.append(b).append(rev.toString()).append(b);
        } else {
            rev.append(b).reverse();
            result.append(a).append(rev.toString()).append(a);
        }
        return result.toString();
    }

}
