package primus.pawel;
//https://www.codewars.com/kata/541c8630095125aba6000c00/train/java

class Exercise_9 {

    public static int digital_root(int n) {

        while (n > 9){
            String number = Integer.toString(n);
            n=0;
            for (int i = 0; i < number.length(); i++) {
                n += Character.getNumericValue(number.charAt(i));
                //System.out.println(number.charAt(i));
            }
            //System.out.println(n);
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
