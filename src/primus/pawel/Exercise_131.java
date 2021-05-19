package primus.pawel;

// Row Weights
// 7kyu
// https://www.codewars.com/kata/5abd66a5ccfd1130b30000a9
// 2021-05-18 T:20:00:07
class Exercise_131 {

    public static int[] rowWeights(final int[] weights) {
        int firstTeamWeigth = 0;
        int secondTeamWeigth = 0;
        for (int i = 0; i < weights.length; i++) {
            if (i % 2 == 0) {
                firstTeamWeigth += weights[i];
            } else {
                secondTeamWeigth += weights[i];
            }
        }
        return new int[]{firstTeamWeigth, secondTeamWeigth}; // Do your magic!
    }

    public static void main(String[] args) {

    }
}
