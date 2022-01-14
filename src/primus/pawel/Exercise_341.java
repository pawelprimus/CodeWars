package primus.pawel;

// Special Number (Special Numbers Series #5)
// 7kyu
// https://www.codewars.com/kata/5a55f04be6be383a50000187/train/java
// 2022-01-14 T:23:48:12
class Exercise_341 {

    public static final String NOT_SPECIAL_NUMBERS = "6789";
    public static final String SPECIAL = "Special!!";
    public static final String NOT_SPECIAL = "NOT!!";

    public static String specialNumber(int number) {
        char[] charArr = String.valueOf(number).toCharArray();
        for (char character : charArr) {
            if (NOT_SPECIAL_NUMBERS.contains(String.valueOf(character))) {
                return NOT_SPECIAL;
            }
        }
        return SPECIAL;
    }

}

/*public static String specialNumber(int num) {
      return isSpecial(num) ? "Special!!" : "NOT!!";
    }

  private static boolean isSpecial(int num) {
    return String.valueOf(num).codePoints().allMatch(i -> i <= '5');
  }*/
