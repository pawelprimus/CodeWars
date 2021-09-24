package primus.pawel;

// Uglify Word
// 7kyu
// https://www.codewars.com/kata/5ce6cf94cb83dc0020da1929/train/java
// 2021-09-24 T:23:38:26
class Exercise_234 {
    public static String uglifyWord(String str) {
        boolean flag = true;
        StringBuilder sb = new StringBuilder();

        char currentChar;
        for (int i = 0; i < str.length(); i++) {
            currentChar = str.charAt(i);

            if (Character.isLetter(currentChar)) {

                if (flag) {
                    flag = false;
                    sb.append(Character.toUpperCase(currentChar));
                } else {
                    flag = true;
                    sb.append(Character.toLowerCase(currentChar));
                }

            } else {
                sb.append(currentChar);
                flag = true;
            }
        }

        return sb.toString();
    }


}
