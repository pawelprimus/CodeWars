package primus.pawel;

// Covfefe
// 7kyu
// https://www.codewars.com/kata/592fd8f752ee71ac7e00008a/train/java
// 2022-03-23 T:21:21:21
class Exercise_403 {

    private static final String COVFEFE = "covfefe";
    private static final String COVERAGE = "coverage";

    public static String covfefe(String tweet) {
        return tweet.contains(COVERAGE) ? tweet.replaceAll(COVERAGE, COVFEFE) : tweet + " " + COVFEFE;
    }

}
