package primus.pawel;

// Bit Counting
// 6kyu
// https://www.codewars.com/kata/526571aae218b8ee490006f4/train/java
//
class Exercise_016 {

    public static int countBits(int n) {
        int counter = 0;
        String binaryRepresentation = Integer.toBinaryString(n);
        //System.out.println(binaryRepresentation);
        for (int i = 0; i < binaryRepresentation.length(); i++) {
            //System.out.println(binaryRepresentation.charAt(i));
            if (binaryRepresentation.charAt(i) == '1') counter++;
        }

        return counter;
    }


    public static void main(String[] args) {

        System.out.println(countBits(5));

    }

}

/* public static int countBits(int n){
    return (int) Integer.toBinaryString(n).chars()
              .filter(c -> c == '1')
              .count();
  }

public static int countBits(int n){
    // Show me the code!
  int num = Integer.bitCount(n);
  return num;
  }


  */
