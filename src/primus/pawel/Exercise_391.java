package primus.pawel;

//
//
//
//
class Exercise_391 {

    public static boolean eightBitNumber(String n) {
        System.out.println(n);
        if (n == null || n.length() == 0) {
            return false;
        }

        Integer num = Integer.valueOf(n);
        if (num < 0 || (num == 0 & n.length() > 1)) {
            return false;
        }

        try {

            String bitNum = String.valueOf(Integer.valueOf(n, 2));
            if (bitNum.length() > 8) {
                return false;
            }

        } catch (NumberFormatException e) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        eightBitNumber("00");
        eightBitNumber("055");
    }
}
