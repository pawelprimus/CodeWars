package primus.pawel;

// Indexed capitalization
// 7kyu
// https://www.codewars.com/kata/59cfc09a86a6fdf6df0000f1/train/java
// 2021-09-09 T:18:47:20
class Exercise_210 {
    public static String capitalize(String s, int[] ind) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < ind.length; i++) {
            int index = ind[i];

            if (index < sb.length() && index > -1) {
                sb.setCharAt(index, Character.toUpperCase(s.charAt(index)));
            }

        }
        return sb.toString();
    }

}
