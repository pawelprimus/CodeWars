package src.primus.pawel;
// Sort deck of cards
// 7kyu
// https://www.codewars.com/kata/56f399b59821793533000683/train/java
// 2022-08-29 T:22:23:13

import java.util.Arrays;

public class Exercise_473 {

  public static String[] sortCards(String[] cards) {

    return Arrays.asList(cards)
        .stream().map(card -> cardToNumber(card))
        .sorted()
        .map(number -> numberToCard(number))
        .toArray(String[]::new);
  }

  static int cardToNumber(String card) {
    switch (card) {
      case "A":
        return 1;
      case "T":
        return 10;
      case "J":
        return 11;
      case "Q":
        return 12;
      case "K":
        return 13;
      default:
        return Integer.parseInt(card);
    }
  }

  static String numberToCard(int number) {
    switch (number) {
      case 1:
        return "A";
      case 10:
        return "T";
      case 11:
        return "J";
      case 12:
        return "Q";
      case 13:
        return "K";
      default:
        return String.valueOf(number);
    }
  }


  public static void main(String[] args) {
    sortCards(new String[]{"3", "9", "A", "5", "T", "8", "2", "4", "Q", "7", "J", "6", "K"});
  }
}
