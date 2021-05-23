package primus.pawel;
// Build a square
// 7kyu
// https://www.codewars.com/kata/59a96d71dbe3b06c0200009c/train/java
// 2021-05-23 T:15:06:51
class Exercise_135 {
    public static final String generateShape(int n) {
        if(n==0) return "";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append("+".repeat(n)).append("\n");
        }
        result.delete(result.length() -1, result.length());
        return result.toString();
    }
}
