package primus.pawel;

// Scrolling Text
// 7kyu
// https://www.codewars.com/kata/5a995c2aba1bb57f660001fd/train/java
// 2022-01-19 T:18:34:29
class Exercise_345 {

    public static String[] scrollingText(String text) {

        String[] result = new String[text.length()];
        for (int i = 0; i < text.length(); i++) {
            result[i] = text.toUpperCase();
            text =  text.substring(1) + result[i].charAt(0);
        }
        return result;
    }

    public static void main(String[] args) {

        scrollingText("CODEWARS");
    }
}
/* public static String[] scrollingText(String text) {
        return java.util.stream.IntStream.range(0, text.length())
          .mapToObj(i -> text.substring(i).toUpperCase() + text.substring(0, i).toUpperCase())
          .toArray(String[]::new);
    }
    */