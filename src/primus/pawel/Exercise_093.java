package primus.pawel;
//
//
//
//

class Exercise_093 {

    public static String backwardsPrime(long start, long end) {
        if (start % 2 == 0) start++;
        if (start < 13) start = 13;

        StringBuilder result = new StringBuilder();
        StringBuilder sb = new StringBuilder();

        for (long i = start; i <= end; i = i + 2) {
            if(String.valueOf(i).charAt(0) % 2 == 1)
            if (isPrime(i)) {
                sb.append(i).reverse();
                if (isPrime(Long.parseLong(sb.toString())) && !isPalindrome(sb.toString())) {
                    result.append(i).append(" ");
                }
                sb.delete(0, sb.length());
            }

        }

        return result.toString().trim();
    }

    public static boolean isPrime(long num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static boolean isPalindrome(String num) {
        for (int i = 0; i < num.length() / 2; i++) {
            if (num.charAt(i) != num.charAt(num.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        backwardsPrime(1, 100);
    }

}


