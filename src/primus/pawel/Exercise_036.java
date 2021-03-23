package primus.pawel;
// Playing with digits
// 6kyu
// https://www.codewars.com/kata/5552101f47fc5178b1000050/train/java
// 2021-03-23 T:23:34:34
class Exercise_036 {

    public static long digPow(int n, int p) {

        StringBuilder numberStr = new StringBuilder(Integer.toString(n));
        double sum = 0;
        int k = 0;
        for (int i = 0; i < numberStr.length(); i++) {

            sum += Math.pow(Character.getNumericValue(numberStr.charAt(i)), (p+i));
        }
        k = (int)(sum/n);
        return  ((n * k) == sum) ?  k :  -1;
    }

    public static void main(String[] args) {

        digPow(46288, 3);

    }

}

/*public static long digPow(int n, int p) {
    String intString = String.valueOf(n);
    long sum = 0;
    for (int i = 0; i < intString.length(); ++i, ++p)
      sum += Math.pow(Character.getNumericValue(intString.charAt(i)), p);
    return (sum % n == 0) ? sum / n : -1;

    public static long digPow(int n, int p) {
    int[] digits = String.valueOf(n).chars().map(Character::getNumericValue).toArray();
    int sum = IntStream.range(0, digits.length).map(i -> (int) Math.pow(digits[i], i + p)).sum();
    return sum % n == 0 ? sum / n : -1;
  }
  }*/
