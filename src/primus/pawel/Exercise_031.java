package primus.pawel;

//SquareDigit
//7kyu
//https://www.codewars.com/kata/546e2562b03326a88e000020/train/java
//2021-03-22 T:18:19:20
class Exercise_031 {

    public static int squareDigits(int n) {
        String number = String.valueOf(n);
        StringBuilder resultSB = new StringBuilder();
        for (int i = 0; i < number.length(); i++) {
            resultSB.append(Character.getNumericValue(number.charAt(i)) * Character.getNumericValue(number.charAt(i)));
        }
        return Integer.parseInt(resultSB.toString());
    }

    public static void main(String[] args) {
        squareDigits(9119);

    }
}
