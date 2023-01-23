package src.primus.pawel;

// Double value every next call
// 7kyu
// https://www.codewars.com/kata/632408defa1507004aa4f2b5/train/java
// 2023-01-23 T:22:44:59
public class Exercise_497 {

    public class A {
        private static int number = 0;

        public static int getNumber() {
            if (number == 0) {
                number = 1;
            } else {
                number = number * 2;
            }
            return number;
        }
    }

}
