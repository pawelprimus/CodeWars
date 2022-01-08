package primus.pawel;
// Email Address Obfuscator
// 7kyu
// https://www.codewars.com/kata/562d8d4c434582007300004e/train/java
// 2022-01-08 T:18:17:11
class Exercise_333 {

    public static String obfuscate(String email) {
        return  email.replace("@", " [at] ").replace(".", " [dot] ");
    }
}
