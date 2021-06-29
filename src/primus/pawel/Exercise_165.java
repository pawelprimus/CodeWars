package primus.pawel;

// Fix string case
// 7kyu
// https://www.codewars.com/kata/5b180e9fedaa564a7000009a/train/java
// 2021-06-29 T:17:41:53
class Exercise_165 {

    public static String solve(final String str) {
        int upperCases = 0;
        int lowerCases = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                upperCases++;
            } else {
                lowerCases++;
            }  
        }
        return (lowerCases >= upperCases) ? str.toLowerCase() : str.toUpperCase();
    }


}
