package primus.pawel;
// Printer Errors
// 7kyu
// https://www.codewars.com/kata/56541980fa08ab47a0000040/train/java
// 2021-04-18 T:14:32:52
class Exercise_081 {

    public static String printerError(String s) {
        int errSum = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= 110  ) errSum++;
        }
        return errSum + "/" + s.length();
    }

}

/*  public static String printerError(String s) {
        return s.replaceAll("[a-m]", "").length() + "/" + s.length();
    }*/