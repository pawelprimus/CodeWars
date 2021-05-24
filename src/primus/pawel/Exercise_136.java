package primus.pawel;

// Make a Window
// 6kyu
// https://www.codewars.com/kata/59c03f175fb13337df00002e/train/java
// 2021-05-25 T:01:12:00
class Exercise_136 {
    public static String makeAWindow(int num) {
        StringBuilder result = new StringBuilder();
        result.append("-".repeat(num * 2 + 3)).append("\n");

        result.append((("|" + ".".repeat(num)) + "|" + ".".repeat(num) + "|" + "\n").repeat(num));

        result.append("|").append("-".repeat(num)).append("+").append("-".repeat(num)).append("|").append("\n");

        result.append((("|" + ".".repeat(num)) + "|" + ".".repeat(num) + "|" + "\n").repeat(num));

        result.append("-".repeat(num * 2 + 3));
       // System.out.println(result.toString());

        return result.toString();
    }

    public static void main(String[] args) {
        makeAWindow(3);
    }

}
