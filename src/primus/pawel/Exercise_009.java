package primus.pawel;

// Sum of Digits / Digital Root
// 6kyu
// https://www.codewars.com/kata/541c8630095125aba6000c00/train/java
//
class Exercise_009 {

    public static int digital_root(int n) {
        while (n > 9) {
            StringBuilder sbNumber = new StringBuilder(Integer.toString(n));
            n = 0;
            for (int i = 0; i < sbNumber.length(); i++) {
                n += Character.getNumericValue(sbNumber.charAt(i));
            }
        }
        return n;
    }

    public static void main(String[] args) {

        System.out.println(digital_root(132189));
    }

}

/* public static int digital_root(int n) {
    while(n > 9){
      n = n/10 + n % 10;
      }
    return(n);
  }*/
