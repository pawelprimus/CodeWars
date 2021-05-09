package primus.pawel;
// Convert string to camel case
// 6kyu
// https://www.codewars.com/kata/517abf86da9663f1d2000003/train/java
// 01.03.2021

class Exercise_001 {

    static String toCamelCase(String s) {

        StringBuffer sb = new StringBuffer(s);
        for (int i = 0; i < sb.length(); i++) {

            if (sb.charAt(i) == '_' || sb.charAt(i) == '-') {
                sb.deleteCharAt(i);
                sb.replace(i, i + 1, String.valueOf(Character.toUpperCase(sb.charAt(i))));
            }
        }
        return String.valueOf(sb);
    }

    public static void main(String[] args) {
        String test = "the-stealth-warrior";
        System.out.println(toCamelCase(test));
    }
}


 /*   static String toCamelCase(String s){
        Matcher m = Pattern.compile("[_|-](\\w)").matcher(s);
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            m.appendReplacement(sb, m.group(1).toUpperCase());
        }
        return m.appendTail(sb).toString();
    }

    static String toCamelCase(String str){
        String[] words = str.split("[-_]");
        return Arrays.stream(words, 1, words.length)
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .reduce(words[0], String::concat);
    }
*/