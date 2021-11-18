package primus.pawel;
// Name Array Capping
//  7kyu
// https://www.codewars.com/kata/5356ad2cbb858025d800111d/train/java
// 2021-11-18 T:20:20:48
class Exercise_289 {

    public static String[] capMe(String[] strings) {
        String[] results = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            results[i] = cappName(strings[i]);
        }
        return results;
    }

    public static String cappName(String name){

        String result = "";
        if(name.length() > 0) {
            result += Character.toUpperCase(name.charAt(0));
        }
        if(name.length() > 1) {
            result += name.substring(1).toLowerCase();
        }
        return result;
    }
}
