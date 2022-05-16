package primus.pawel;

// Points in the circle
// 6kyu
// https://www.codewars.com/kata/5b55c49d4a317adff500015f/train/java
// 2022-05-16 T:21:25:06
class Exercise_451 {

    public static int pointsNumber(int radius) {
        int quarterOfResults = 0;

        for (int i = 0; i <= radius; i++) {
            for (int j = 1; j <= radius; j++) {
                if (i * i + j * j <= radius * radius) {
                    quarterOfResults++;
                }
            }
        }
        return (quarterOfResults ) * 4 + 1;
    }

    public static void main(String[] args) {
        System.out.println(pointsNumber(1000));
    }
}
