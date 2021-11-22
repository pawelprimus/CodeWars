package primus.pawel;
// Switcheroo
// 7kyu
// https://www.codewars.com/kata/57f759bb664021a30300007d/train/java
// 2021-11-22 T:22:23:48
class Exercise_293 {

    public static String switcheroo(String x) {
        StringBuilder sb = new StringBuilder();
        char c;
        for (int i = 0; i < x.length(); i++) {
            c = x.charAt(i);
            if(c == 'a'){
                sb.append("b");
            } else if(c == 'b'){
                sb.append("a");
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
