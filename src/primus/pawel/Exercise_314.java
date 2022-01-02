package primus.pawel;
// What's my golf score?
// 7kyu
// https://www.codewars.com/kata/59f7a0a77eb74bf96b00006a/train/java
// 2022-01-02 T:13:18:12
class Exercise_314 {
    public static int golfScoreCalculator(String parList, String scoreList) {
        int result = 0;
        for (int i = 0; i < parList.length(); i++) {
            result += (int)scoreList.charAt(i) - (int)parList.charAt(i);
        }
        return result;
    }
}
/* static int golfScoreCalculator(String parList, String scoreList) {
    return range(0, 18).map(i -> scoreList.charAt(i) - parList.charAt(i)).sum();
  }
  */