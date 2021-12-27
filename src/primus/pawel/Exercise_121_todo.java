package primus.pawel;

// Merged String Checker
// 5kyu
//https://www.codewars.com/kata/54c9fcad28ec4c6e680011aa/train/java
// 2021-05-10 T:21:49:13
class Exercise_121_todo {

    public static boolean isMerge(String s, String part1, String part2) {
        if ((part1 + part2).equals(s)) return true;
        if ((part2 + part1).equals(s)) return true;

        int index_part1 = 0;
        int index_part2 = 0;

        char loopChar;
        for (int i = 0; i < s.length(); i++) {
            loopChar = s.charAt(i);

            if ( index_part1< part1.length() &&loopChar == part1.charAt(index_part1) ) {
                index_part1++;
            } else if (index_part2< part2.length() && loopChar == part2.charAt(index_part2) ) {
                index_part2++;
            } else {
                return false;
            }

        }
        return true;
    }

}
