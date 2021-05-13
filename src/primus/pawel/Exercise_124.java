package primus.pawel;
// Split In Parts
// 7kyu
// https://www.codewars.com/kata/5650ab06d11d675371000003/train/java
// 2021-05-13 T:22:36:50
class Exercise_124 {

    public static String splitInParts(String s, int partLength) {
        StringBuilder result = new StringBuilder();
        int summer = 0;

        for (int i = 0; i < s.length(); i++) {

            result.append(s.charAt(i));
            summer++;
            if(summer == partLength){
                result.append(" ");
                summer = 0;
            }

        }

        return result.toString().trim();
    }


}
