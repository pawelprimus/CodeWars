package primus.pawel;
// Duplicate Encoder
// 6kyu
// https://www.codewars.com/kata/54b42f9314d9229fd6000d9c/train/java
// 2021-03-16 T:18:46:21

class Exercise_021 {

    static String encode(String word) {
        StringBuilder wordSB = new StringBuilder(word.toUpperCase());
        StringBuilder resultSb = new StringBuilder();

        int[] resultTab = new int[126];
        for (int i = 0; i < wordSB.length(); i++) {
            //System.out.println((int)text.charAt(i));
            resultTab[(int) wordSB.charAt(i)]++;
        }

        for (int i = 0; i < wordSB.length(); i++) {
            if (resultTab[(int) wordSB.charAt(i)] > 1) {
                resultSb.append(")");
            } else
                resultSb.append("(");
        }
        return resultSb.toString();
    }

    public static void main(String[] args) {

        System.out.println(encode("Success"));

    }

}
