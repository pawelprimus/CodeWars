package primus.pawel;

// Replace every nth
// 7kyu
// https://www.codewars.com/kata/57fcaed83206fb15fd00027a/train/java
// 2022-01-07 T:01:44:39
class Exercise_328 {

    public static String replaceNth(String text, int n, char oldValue, char newValue) {
        StringBuilder result = new StringBuilder();
        int counter = 0;
        char loopChar;
        for (int i = 0; i < text.length(); i++) {
            loopChar = text.charAt(i);
            if (loopChar == oldValue) {
                counter++;
                if (counter == n) {
                    result.append(newValue);
                    counter=0;
                } else {
                    result.append(loopChar);
                }
            } else {
                result.append(loopChar);
            }
        }
        return result.toString();
    }
}
