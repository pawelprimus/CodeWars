package primus.pawel;

// Without the letter 'E'
// 7kyu
// https://www.codewars.com/kata/594b8e182fa0a0d7fc000875/train/java
// 2021-09-27 T:23:14:34
class Exercise_237 {

    public static String findE(String str) {
        if (str.length() == 0) {
            return "";
        }
        if (str==null) {
            return null;
        }

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.toLowerCase(str.charAt(i)) == 'e') {
                count++;
            }
        }
        return count > 0 ? String.valueOf(count) : "There is no \"e\".";
    }


}
