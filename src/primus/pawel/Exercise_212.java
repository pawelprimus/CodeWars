package primus.pawel;

// CamelCaseMethod
// 6kyu
// https://www.codewars.com/kata/587731fda577b3d1b0001196/train/java
// 2021-09-09 T:19:29:23
class Exercise_212 {

    public static String camelCase(String str) {
        if (str.length() == 0 || str.equals(null)) {
            return "";
        }
        String[] arrayOfWords = str.split("\\s");
        StringBuilder sbResult = new StringBuilder();
        String word;
        for (int i = 0; i < arrayOfWords.length; i++) {
            word = arrayOfWords[i];
            System.out.println(word);

            sbResult.append(capitalize(word));
        }
        return sbResult.toString();
    }

    public static String capitalize(String str) {
        if (str == null) return str;
        if (str.length() < 1) {
            return str.toUpperCase();
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public static void main(String[] args) {
        System.out.println(camelCase("ab      c"));
    }
}
