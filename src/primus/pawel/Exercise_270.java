package primus.pawel;
// Greet Me
// 7kyu
// https://www.codewars.com/kata/535474308bb336c9980006f2/train/java
// 2021-11-06 T:10:55:31
class Exercise_270 {

    public static String greet(String name){
        StringBuilder result = new StringBuilder();
        result.append("Hello ").append(Character.toUpperCase(name.charAt(0))).append(name.substring(1).toLowerCase()).append("!");
        return result.toString();
    }

}
