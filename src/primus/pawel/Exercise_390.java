package primus.pawel;

// Is n divisible by (...)?
// 7kyu
// https://www.codewars.com/kata/558ee8415872565824000007/train/java
// 2022-03-06 T:10:30:11
class Exercise_390 {

    public static boolean isDivisible(int... ints) {
        int firstNumber = ints[0];
        for (int i = 1; i < ints.length; i++) {
            if (firstNumber % ints[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        isDivisible(3, 3, 4);
    }
}

/*  return values.length <= 1 || Arrays.stream(values)
                .skip(1)
                .allMatch(i -> i != 0 && values[0] % i == 0);
  }*/