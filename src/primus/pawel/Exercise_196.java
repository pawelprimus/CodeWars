package primus.pawel;
// Determine if the poker hand is flush
// 7kyu
// https://www.codewars.com/kata/5acbc3b3481ebb23a400007d
// 2021-08-24 T:13:04:18
class Exercise_196 {

    public static boolean CheckIfFlush(String[] cards){
        String mainSuit = "";
        String firstCard = cards[0];
        if(firstCard.contains("H")) {
            mainSuit = "H";
        }
        if(firstCard.contains("S")) {
            mainSuit = "S";
        }
        if(firstCard.contains("D")) {
            mainSuit = "D";
        }
        if(firstCard.contains("C")) {
            mainSuit = "C";
        }
        for (int i = 1; i < cards.length; i++) {
            if(!cards[i].contains(mainSuit)){
                return false;
            }
        }
        return true;
    }
}

/* public static boolean CheckIfFlush(String[] cards){
      final char target = cards[0].charAt(cards[0].length()-1);
      return Arrays.stream(cards)
                   .allMatch( s -> s.charAt(s.length()-1) == target );
  }

 public static boolean CheckIfFlush(String[] cards) {

    char c = ' ';

    if (cards[0].charAt(1) != '0') {
      c = cards[0].charAt(1);
    } else {
      c = cards[0].charAt(2);
    }

    for (int i = 1; i < cards.length; i++) {
      if (cards[i].charAt(1) == '0') {
        if (cards[i].charAt(2) != c) {
          return false;
          }
        } else {
          if (cards[i].charAt(1) != c) {
            return false;
          }
        }
    }
    return true;
}


  */