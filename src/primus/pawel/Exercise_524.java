package src.primus.pawel;

// Bulls and Cows
// 7kyu
// https://www.codewars.com/kata/5be1a950d2055d589500005b/train/java
// 2023-09-05 T:21:35:51
public class Exercise_524 {




    public static void main(String[] args) {
        BullsAndCows bullsAndCows = new BullsAndCows(7536);
        System.out.println(bullsAndCows.compareWith(1234));
        System.out.println(bullsAndCows.compareWith(5601));
    }
}

