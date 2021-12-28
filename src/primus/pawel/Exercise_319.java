package primus.pawel;
// Nickname Generator
// 7kyu
// https://www.codewars.com/kata/593b1909e68ff627c9000186/train/java
// 2021-12-28 T:17:57:11
class Exercise_319 {

    private static String ERROR = "Error: Name too short";
    public static String nickname (String name) {

        if(name.length() < 4){
            return ERROR;
        }

        if(isVowel(String.valueOf(name.charAt(2)))){
            return name.substring(0,4);
        } else {
            return name.substring(0,3);
        }
    }

    public static boolean isVowel(String s) {
        return s.matches("[aeiouAEIOU]");
    }


}
