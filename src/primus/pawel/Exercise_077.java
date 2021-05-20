package primus.pawel;

// Two fighters, one winner.
// 7kyu
// https://www.codewars.com/kata/577bd8d4ae2807c64b00045b/train/java
//  2021-04-14 T:19:47:33
class Exercise_077 {

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {

        String winnerName = "";

        if (!firstAttacker.equals(fighter1.name)) {
            Fighter temp = fighter1;
            fighter1 = fighter2;
            fighter2 = temp;
        }

        while (fighter1.health >= 0 && fighter2.health >= 0) {

            fighter2.health = fighter2.health - fighter1.damagePerAttack;
            if (fighter2.health <= 0) {
                winnerName = fighter1.name;
                return winnerName;
            }

            fighter1.health = fighter1.health - fighter2.damagePerAttack;
            if (fighter1.health <= 0) {
                winnerName = fighter2.name;
                return winnerName;
            }

        }
        return winnerName;
    }

    public static class Fighter {
        public String name;
        public int health, damagePerAttack;

        public Fighter(String name, int health, int damagePerAttack) {
            this.name = name;
            this.health = health;
            this.damagePerAttack = damagePerAttack;
        }
    }

    public static void main(String[] args) {
        System.out.println(declareWinner(new Fighter("Lew", 10, 2), new Fighter("Harry", 5, 4), "Lew"));
    }

}

/* public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
    Fighter a=fighter1, b=fighter2;
    if (firstAttacker.equals(fighter2.name)) {
      a = fighter2; b = fighter1;
    }
    while (true) {
      if ((b.health -= a.damagePerAttack) <= 0) return a.name;  // a wins
      if ((a.health -= b.damagePerAttack) <= 0) return b.name;  // b wins
    }
  }


  */
