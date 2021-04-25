package primus.pawel;

// sum of numbers from 0 to N
// 7kyu
// https://www.codewars.com/kata/56e9e4f516bcaa8d4f001763/train/java
// 2021-04-25 T:21:17:31
class Exercise_098 {
    public static String showSequence(int value) {
        if (value < 0) return value + "<0";
        if (value == 0) return "0=0";
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= value; i++) {
            sum += i;
            sb.append(i).append("+");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.append(" = ").append(sum).toString();
    }

}
