package src.primus.pawel;

// Find the index of the second occurrence of a letter in a string
// 7kyu
// https://www.codewars.com/kata/63f96036b15a210058300ca9/train/java
// 2023-04-26 T:19:29:03
public class Exercise_518 {

    public static int secondSymbol(String str, char c) {
        boolean isFirstFound = false;
        char[] strCharArray = str.toCharArray();
        for (int i = 0; i < strCharArray.length; i++) {

            if (strCharArray[i] == c) {
                if (isFirstFound) {
                    return i;
                }
                isFirstFound = true;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(secondSymbol("Hello world!!!", 'l'));
    }
}
