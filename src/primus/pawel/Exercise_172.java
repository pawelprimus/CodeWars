package primus.pawel;

// Binary to Text (ASCII) Conversion
// 6kyu
// https://www.codewars.com/kata/5583d268479559400d000064/train/java
// 2021-07-06 T:23:54:49
class Exercise_172 {

    public static String binaryToText(String binary) {
        if(binary.length() == 0){
            return "";
        }

        StringBuilder sbResult = new StringBuilder();
        int i = 0;
        while (i < binary.length()) {

            StringBuilder sbBinary = new StringBuilder();
            while (sbBinary.length() < 8) {
                sbBinary.append(binary.charAt(i));
                i++;
            }
            sbResult.append(binaryToChar(sbBinary.toString()));
            sbBinary.delete(0, sbBinary.length());
        }
        return sbResult.toString();
    }

    public static char binaryToChar(String binaryString) {
        int charNumber = Integer.parseInt(binaryString, 2);
        System.out.println(charNumber);
        char c = (char) charNumber;
        return c;
    }

    public static void main(String[] args) {
        System.out.println(binaryToText("0100100001100101011011000110110001101111"));
    }

}

/* public static String binaryToText(String binary) {
    StringBuilder value = new StringBuilder();
        for (int i=0; i<binary.length(); i=i+8){
            value.append((char) Integer.parseInt(binary.substring(i, i + 8),2));
        }
        return value.toString();
  }*/