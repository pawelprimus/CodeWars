package primus.pawel;

import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// New Cashier Does Not Know About Space or Shift
// 6kyu
// https://www.codewars.com/kata/5d23d89906f92a00267bb83d/train/java
// 2021-09-11 T:12:25:38
class Exercise_215 {
    public static String getOrder(String input) {

        StringBuilder resultSB = new StringBuilder();

        LinkedList<String> ordersOccurences = new LinkedList<>();
        ordersOccurences.add("Burger");
        ordersOccurences.add("Fries");
        ordersOccurences.add("Chicken");
        ordersOccurences.add("Pizza");
        ordersOccurences.add("Sandwich");
        ordersOccurences.add("Onionrings");
        ordersOccurences.add("Milkshake");
        ordersOccurences.add("Coke");

        Pattern groupPattern;
        Matcher groupMatcher;
        int occurences = 0;

        for (String searchWord : ordersOccurences) {

            groupPattern = Pattern.compile(searchWord.toLowerCase());
            groupMatcher = groupPattern.matcher(input);

            while (groupMatcher.find()) {
                occurences++;
            }

            if (occurences > 0) {
                resultSB.append((searchWord + " ").repeat(occurences));
            }
            occurences = 0;

        }

        return resultSB.toString().trim();
    }

    public static void main(String[] args) {

        getOrder("milkshakepizzachickenfriescokeburgerpizzasandwichmilkshakepizza");
    }
}


/*1. Burger
2. Fries
3. Chicken
4. Pizza
5. Sandwich
6. Onionrings
7. Milkshake
8. Coke
*/