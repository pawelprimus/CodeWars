package primus.pawel;

// Caffeine Script
// 7kyu
// https://www.codewars.com/kata/5434283682b0fdb0420000e6
// 2022-04-10 T:10:02:17
class Exercise_411 {

    private static final String MOCHA = "mocha_missing!";
    private static final String JAVA = "Java";
    private static final String SCRIPT = "Script";
    private static final String COFFEE = "Coffee";

    public static String caffeineBuzz(int n) {
        if (n % 3 == 0 && n % 4 == 0) {
            return COFFEE + SCRIPT;
        }
        if (n % 3 == 0) {
            return n%2 == 0 ? JAVA + SCRIPT : JAVA;
        }
        return MOCHA;
    }

    public static void main(String[] args) {


    }

}
