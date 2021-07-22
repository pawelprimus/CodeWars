package primus.pawel;

// Disemvowel Trolls
// 7kyu
// https://www.codewars.com/kata/52fba66badcd10859f00097e/train/java
// 2021-07-22 T:22:54:34
class Exercise_185 {
    public static String disemvowel(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (!isVowel(String.valueOf(str.charAt(i)))) {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }

    public static boolean isVowel(String s) {
        return s.matches("[aeiouAEIOU]");
    }
}

/* public static String disemvowel(String str) {
      return str.replaceAll("[aAeEiIoOuU]", "");
  }
  */