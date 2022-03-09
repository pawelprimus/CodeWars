package primus.pawel;

// Snail crawls up
// 7kyu
// https://www.codewars.com/kata/5b93fecd8463745630001d05/train/java
// 2022-03-09 T:01:33:56
class Exercise_393 {

    public static int snail(int column, int day, int night) {
        int snailedMeters = 0;
        int days = 0;
        while (true) {
            days++;
            snailedMeters += day;
            if (snailedMeters > column) {
                return days;
            }
            snailedMeters -= night;
        }
    }

    public static void main(String[] args) {
        snail(3, 2, 1);
    }
}
