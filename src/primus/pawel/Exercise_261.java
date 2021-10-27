package primus.pawel;
// Jumping Number (Special Numbers Series #4)
// 7kyu
// https://www.codewars.com/kata/5a54e796b3bfa8932c0000ed/train/java
// 2021-10-27 T:20:06:17
class Exercise_261 {

    private static final String JUMPING = "Jumping!!";
    private static final String NOT = "Not!!";

    public static String jumpingNumber(int number)
    {
        String stringNumber = String.valueOf(number);
        System.out.println(stringNumber);
        if(stringNumber.length() == 1 ){
            return JUMPING;
        }

        for (int i = 1; i < stringNumber.length(); i++) {
            if(Math.abs(stringNumber.charAt(i) - stringNumber.charAt(i-1)) > 1){
                return NOT;
            }
        }

        return JUMPING;
    }

    public static void main(String[] args) {
        System.out.println(jumpingNumber(30120));
    }


}
