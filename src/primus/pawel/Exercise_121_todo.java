package primus.pawel;

// Merged String Checker
// 7kyu
//https://www.codewars.com/kata/54c9fcad28ec4c6e680011aa/train/java
// 2021-05-10 T:21:49:13
class Exercise_121_todo {

    public static boolean isMerge(String s, String part1, String part2) {
        if ((part1 + part2).equals(s)) return true;
        if ((part2 + part1).equals(s)) return true;

        int shorterLength = 0;
        int longerLength = 0;

        if (part1.length() > part2.length()) {
            longerLength = part1.length();
            shorterLength = part2.length();
        } else {
            longerLength = part2.length();
            shorterLength = part1.length();
        }

        StringBuilder sbResultVer_1 = new StringBuilder();
        StringBuilder sbResultVer_2 = new StringBuilder();
        int i = 0;
        for (i = 0; i < shorterLength; i++) {
            sbResultVer_1.append(part1.charAt(i));
            sbResultVer_1.append(part2.charAt(i));

            sbResultVer_2.append(part1.charAt(i));
            sbResultVer_2.append(part2.charAt(i));

        }

        if (part1.length() == part2.length()) {
            if (sbResultVer_1.toString().equals(s)) return true;
            return sbResultVer_2.toString().equals(s);
        }

        if (part1.length() > part2.length()) {
            sbResultVer_1.append(part1.substring(i, part1.length() - 1));
            sbResultVer_2.append(part1.substring(i, part1.length() - 1));
            if (sbResultVer_1.toString().equals(s)) return true;
            return sbResultVer_2.toString().equals(s);
        } else {
            sbResultVer_1.append(part2.substring(i, part2.length() - 1));
            sbResultVer_2.append(part2.substring(i, part2.length() - 1));
            if (sbResultVer_1.toString().equals(s)) return true;
            return sbResultVer_2.toString().equals(s);
        }


        //return false;
    }

}
