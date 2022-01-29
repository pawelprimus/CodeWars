package primus.pawel;

import java.util.List;

// Password maker
// 7kyu
// https://www.codewars.com/users/%3Cprim%3Erim%3C%2Fprim%3E
// 2022-01-29 T:11:39:55
class Exercise_354 {

    public static String makePassword(String phrase) {

        if(phrase.length() == 0){
            return "";
        }

        List<String> words = List.of(phrase.split(" "));
        StringBuilder sb = new StringBuilder();
        char c;

        for (String word : words) {
            c = Character.toUpperCase(word.charAt(0));
            switch (c) {
                case 'I':
                    sb.append("1");
                    break;
                case 'O':
                    sb.append("0");
                    break;
                case 'S':
                    sb.append("5");
                    break;
                default:
                    sb.append(word.charAt(0));
            }
        }

        return sb.toString();
    }

}
