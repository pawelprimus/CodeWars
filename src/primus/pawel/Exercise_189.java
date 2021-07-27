package primus.pawel;

// lucky number
// 7kyu
// https://www.codewars.com/kata/55afed09237df73343000042/train/java
// 2021-07-27 T:17:41:29
class Exercise_189 {
    public static boolean isLucky(long n) {
        String parsedN = String.valueOf(n);
        int sum = 0;
        for (int i = 0; i < parsedN.length(); i++) {
            sum += Character.getNumericValue(parsedN.charAt(i));
        }

        return (sum % 9 == 0 || sum == 0);
    }

    public static void main(String[] args) {
        isLucky(123456);
    }

}
