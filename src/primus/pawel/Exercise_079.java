package primus.pawel;
// Word a10n (abbreviation)
//  6kyu
// https://www.codewars.com/kata/5375f921003bf62192000746/train/java
// 2021-04-15 T:20:10:38

class Exercise_079 {

    public static String abbreviate(String string) {
        StringBuilder sbResult = new StringBuilder();
        StringBuilder sbWord = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            if (!Character.isLetter(string.charAt(i))) {
                sbResult.append(abbreviateWord(sbWord.toString())).append(string.charAt(i));
                sbWord.delete(0, sbWord.length());
            } else {
                sbWord.append(string.charAt(i));
            }
        }
        return sbResult.append(abbreviateWord(sbWord.toString())).toString();
    }

    public static String abbreviateWord(String word) {
        if (word.length() <= 3) return word;
        int n = word.length() -2;
        return "" + word.charAt(0) + n + word.charAt(word.length()-1);
    }

    public static void main(String[] args) {
        abbreviate("elephant-rides are really fun!");
        System.out.println(Character.isLetter('-'));
    }

}

/*public String abbreviate(String s) {
    Pattern p = Pattern.compile("[a-z]{4,}", Pattern.CASE_INSENSITIVE);
    Matcher m = p.matcher(s);
    StringBuffer sb = new StringBuffer();
    while (m.find()) {
      String g = m.group();
      int l = g.length();
      m.appendReplacement(sb, g.substring(0, 1) + (l - 2) + g.substring(l - 1, l));
    }
    m.appendTail(sb);
    return sb.toString();
  }


  */
