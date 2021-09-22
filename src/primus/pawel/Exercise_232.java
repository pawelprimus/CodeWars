package primus.pawel;
// String Merge!
// 7kyu
// https://www.codewars.com/kata/597bb84522bc93b71e00007e/train/java
// 2021-09-23 T:00:28:59
class Exercise_232 {

    public static String stringMerge(String s1, String s2, char letter) {
        return s1.substring(0, s1.indexOf(letter) ) + s2.substring(s2.indexOf(letter), s2.length());
    }

    public static void main(String[] args) {
        stringMerge("person","here", 'e');
    }

}
