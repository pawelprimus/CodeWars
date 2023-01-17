package src.primus.pawel;

// The Culling of Stratholme
// 7kyu
// https://www.codewars.com/kata/634913db7611b9003dff49ad
// 2023-01-17 T:22:05:22

public class Exercise_492 {

    public static String purify(String s) {


        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb);

        if (s == null || s.length() == 0) {
            return "";
        }
        if (sb.length() == 1) {
            if (isInfected(sb.charAt(0))) {
                return "";
            } else {
                return sb.toString();
            }
        }
        if (isInfected(sb.charAt(0))) {
            sb.replace(0, 1, "!");
            if (sb.charAt(1) != ' ' && !isInfected(sb.charAt(1))) {
                sb.replace(1, 2, "!");
            }
        }

        for (int i = 1; i < s.length() - 1; i++) {
            if (isInfected(sb.charAt(i))) {

                sb.replace(i, i + 1, "!");
                if (sb.charAt(i + 1) != ' ' && !isInfected(sb.charAt(i + 1))) {
                    sb.replace(i + 1, i + 2, "!");
                }
                if (sb.charAt(i - 1) != ' ') {
                    sb.replace(i - 1, i, "!");
                }
            }
        }
        if (isInfected(sb.charAt(sb.length() - 1))) {
            sb.replace(sb.length() - 1, sb.length() , "!");
            if (sb.charAt(sb.length() - 2) != ' ') {
                sb.replace(sb.length() - 2, sb.length() - 1, "!");
            }
        }
        return sb.toString().replaceAll("!", "").replaceAll("\\s+", " ").trim();
    }

    private static boolean isInfected(char c) {
        return c == 'i' || c == 'I';
    }

    public static void main(String[] args) {
        System.out.println(purify("eY74tizam Iq I9 1i j1G lXixio"));
    }

}
