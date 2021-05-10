package primus.pawel;
// Mumbling
// 7kyu
// https://www.codewars.com/kata/5667e8f4e3f572a8f2000039/train/java
//

class Exercise_010 {

    public static String accum(String s) {
        StringBuilder resultsb = new StringBuilder("");

        for (int i = 0; i < s.length(); i++) {
            resultsb.append(Character.toUpperCase(s.charAt(i)));
            for (int j = (s.length() - i); j < s.length(); j++) {
                resultsb.append(Character.toLowerCase(s.charAt(i)));
            }
            resultsb.append("-");
        }
        return resultsb.substring(0, resultsb.length() - 1);
    }

    public static void main(String[] args) {

        System.out.println(accum("Abcd"));

    }

}

/*    public static String accum(String s) {
        s = s.toLowerCase();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            builder.append(Character.toUpperCase(ch));
            for (int j = 0; j < i; j++) {
                builder.append(ch);
            }
            builder.append("-");
        }

        return builder.deleteCharAt(builder.lastIndexOf("-")).toString();
    }*/