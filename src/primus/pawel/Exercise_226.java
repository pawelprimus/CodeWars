package primus.pawel;
// Growth of a Population
// 7kyu
// https://www.codewars.com/kata/563b662a59afc2b5120000c6/train/java
// 2021-09-16 T:21:21:13
class Exercise_226 {


    public static int nbYear(int p0, double percent, int aug, int p) {
        double population = p0;
        int years = 0;

        while (population< p) {
            population = population + population*percent/100 + aug;
            years++;
        }

        return years;
    }


}
