package primus.pawel;
// Rotate for a Max
// 7kyu
// https://www.codewars.com/kata/56a4872cbb65f3a610000026/train/java
// 2021-10-09 T:13:01:02
class Exercise_245 {

    public static long maxRot (long n) {
        long biggestRot = n;
        String rotatedNumber = (String.valueOf(n));
        //String rotatedNumber = makeOneRotation (String.valueOf(n));

        for (int i = 0; i < rotatedNumber.length() -1 ; i++) {
            rotatedNumber =  rotatedNumber.substring(0, i) + makeOneRotation(rotatedNumber.substring(i , rotatedNumber.length()));
            System.out.println(rotatedNumber);

            if(Long.parseLong(rotatedNumber) > biggestRot){
                biggestRot = Long.parseLong(rotatedNumber);
            }
        }

    return biggestRot;
    }


    public static String makeOneRotation(String number){
        String stringNumber = number;
        return stringNumber.substring(1, stringNumber.length()) + stringNumber.charAt(0);
    }

    public static void main(String[] args) {

        System.out.println( maxRot(38458215));
    }
}
