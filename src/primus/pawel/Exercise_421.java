package primus.pawel;

// Folding your way to the moon
// 7kyu
// https://www.codewars.com/kata/58f0ba42e89aa6158400000e/train/java
// 2022-04-19 T:23:07:18
class Exercise_421 {


    public static Long fold(Double distance) {

        Double currentPaper = 0.0001;
        if (distance < 0) {
            return null;
        }
        if (distance <= currentPaper) {
            return 0L;
        }

        Long folded = 0L;
        while (currentPaper < distance) {
            currentPaper *= 2;
            folded++;
        }

        return folded;
    }

    public static void main(String[] args) {
        fold(384000000.0);
    }

}
