package primus.pawel;

import java.util.Collections;

// Scaling Squared Strings
// 7kyu
// https://www.codewars.com/kata/56ed20a2c4e5d69155000301/train/java
// 2021-11-13 T:13:34:02
class Exercise_284 {
    public static String scale(String strng, int k, int v) {
        String[] lines = strng.split("\n");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < lines.length; i++) {
            String line = lines[i];
            StringBuilder newLine = new StringBuilder();
            for (int j = 0; j < line.length(); j++) {
                String c = String.valueOf(line.charAt(j));
                newLine.append(String.join("", Collections.nCopies(k, c)));

            }
            newLine.append("\n");
            result.append(String.join("", Collections.nCopies(v, newLine)));
        }
        return result.toString().trim();
    }
}
