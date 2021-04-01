package primus.pawel;
// Regex validate PIN code
// 7kyu
// https://www.codewars.com/kata/55f8a9c06c018a0d6e000132/train/java
// 2021-04-01 T:21:41:52
class Exercise_051 {
    public static boolean validatePin(String pin) {
        String regex = "[0-9]+";
        return (pin.matches(regex) && (pin.length() == 4 || pin.length()==6) );
    }

    public static void main(String[] args) {
        System.out.println(validatePin("1234a2"));
    }
}

/* public static boolean validatePin(String pin) {
    return pin.matches("\\d{4}|\\d{6}");
  }




  */
