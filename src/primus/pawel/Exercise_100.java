package primus.pawel;
// Backspaces in string
// 6kyu
// https://www.codewars.com/kata/5727bb0fe81185ae62000ae3/train/java
// 2021-04-27 T:19:13:14
class Exercise_100 {

    public String cleanString(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!= '#'){
                sb.append(s.charAt(i));
            } else {
                if(sb.length()>0) sb.deleteCharAt(sb.length()-1);
            }
        }
        return sb.toString();
    }
}
