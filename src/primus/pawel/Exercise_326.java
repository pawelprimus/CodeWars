package primus.pawel;

// ANTISTRING
// 7kyu
// https://www.codewars.com/kata/5ab349e01aaf060cd0000069/train/java
// 2022-01-04 T:21:09:05
class Exercise_326 {

    private static int ASCI_FIRST_BIG_LETTER = 65;
    private static int ASCI_FIRST_SMALL_LETTER = 97;
    private static int ALL_NUMBERS = 25;

    public static String antiString(String str) {

        StringBuilder result = new StringBuilder();

        for (char loopChar : str.toCharArray()) {

            if (Character.isDigit(loopChar)) {
                result.append(9 - Integer.parseInt(String.valueOf(loopChar)));
            } else {
                if (Character.isUpperCase(loopChar)) {
                    loopChar = Character.toLowerCase(loopChar);
                    result.append((char) (ASCI_FIRST_SMALL_LETTER + ALL_NUMBERS + ASCI_FIRST_SMALL_LETTER - (int) loopChar));
                } else {
                    loopChar = Character.toUpperCase(loopChar);
                    result.append((char) (ASCI_FIRST_BIG_LETTER + ALL_NUMBERS + ASCI_FIRST_BIG_LETTER - (int) loopChar));
                }
            }
        }
        return result.reverse().toString();
    }


    public static void main(String[] args) {
        System.out.println(antiString("abcWXY123"));
    }
}
