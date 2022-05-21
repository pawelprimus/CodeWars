package primus.pawel;

import java.util.stream.IntStream;

// Lucky Tickets
// 6kyu
// https://www.codewars.com/kata/5843f66613ee50e56c0000b9/train/java
// 2022-05-21 T:11:55:00
class Exercise_455 {


    public int numberOfTickets(int from, int to) {
        return (int) IntStream.rangeClosed(from, to).filter(i -> isLucky(i)).count();
    }

    private static boolean isLucky(int number) {
        String strNumber = String.valueOf(number);
        return (strNumber.charAt(0) + strNumber.charAt(1) + strNumber.charAt(2))
                == (strNumber.charAt(3) + strNumber.charAt(4) + strNumber.charAt(5));
    }

    public static void main(String[] args) {

        System.out.println(isLucky(123322));
    }
}
