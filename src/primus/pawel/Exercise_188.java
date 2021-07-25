package primus.pawel;

// Ultimate Array Reverser
// 7kyu
// https://www.codewars.com/kata/5c3433a4d828182e420f4197/train/java
// 2021-07-25 T:14:19:14
class Exercise_188 {
    public static String[] reverse(String[] a) {
        StringBuilder allCharacters = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length(); j++) {
                allCharacters.append(a[i].charAt(j));
            }
        }

        String[] resultStringArray = new String[a.length];

        int allCharsChainLength = allCharacters.length() - 1;
        StringBuilder simpleWord = new StringBuilder();

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length(); j++) {
                simpleWord.append(allCharacters.charAt(allCharsChainLength));
                allCharsChainLength--;
            }
            resultStringArray[i] = simpleWord.toString();
            simpleWord.delete(0, simpleWord.length());
        }

        return resultStringArray;
    }

    public static void main(String[] args) {
        reverse(new String[]{"!", "eilt", "onn", "acIdn", "ast", "t", "ubgibe", "kilI"});

    }

}
