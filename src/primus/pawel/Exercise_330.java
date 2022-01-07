package primus.pawel;

// Thinking & Testing : Incomplete string
// 7kyu
// https://www.codewars.com/kata/56d9292cc11bcc3629000533/train/java
// 2022-01-07 T:22:40:45
class Exercise_330 {

    public static String testIncompleteString(String s) {
        StringBuilder result = new StringBuilder();
        if (s.length() == 0) {
            return "";
        }
        for (int i = 0; i < s.length() - 1; i = i + 2) {

            int num = (s.charAt(i) + s.charAt(i + 1)) / 2;
            result.append((char) num);
        }
        if (s.length() % 2 != 0) {
            result.append(s.charAt(s.length()-1));

        }

        return result.toString();
    }

    public static void main(String[] args) {
        testIncompleteString("yxywjykc");
    }
}
