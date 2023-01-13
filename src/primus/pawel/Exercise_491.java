package src.primus.pawel;

// Circle cipher
// 7kyu
// https://www.codewars.com/kata/634d0723075de3f97a9eb604/train/java
// 2023-01-14 T:00:44:43
public class Exercise_491 {

    public static String encode(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < (s.length() / 2); i++) {
            sb.append(s.charAt(i)).append(s.charAt(s.length() - 1 - i));
        }
        if (s.length() % 2 != 0) {
            sb.append(s.charAt(s.length() / 2));
        }

        return sb.toString();
    }

    public static String decode(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i += 2) {
            sb.append(s.charAt(i));
        }
        int odd = s.length() % 2 != 0 ? 1 : 0;
        for (int i = s.length() - 1 - odd; i > 0; i -= 2) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(encode("codewars"));
        System.out.println(decode("csordaew"));

        System.out.println(encode("white"));
        System.out.println(decode("wehti"));
    }
}
