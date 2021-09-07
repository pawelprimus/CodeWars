package primus.pawel;

// Round up to the next multiple of 5
// 7kyu
// https://www.codewars.com/kata/55d1d6d5955ec6365400006d/train/java
// 2021-09-07 T:20:49:15
class Exercise_206 {
    public static int roundToNext5(int number) {
        if (number == 0) {
            return 0;
        } else if (number % 5 == 0) {
            return number;
        }

        return (number > 0) ? number + (5 - number % 5) : number + Math.abs(5 - number % 5) - 5;
    }

    public static void main(String[] args) {
        System.out.println(roundToNext5(-1));
    }


}
