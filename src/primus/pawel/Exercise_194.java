package primus.pawel;

// Credit card issuer checking
// 2021-08-02 T:23:18:33
// https://www.codewars.com/kata/5701e43f86306a615c001868/train/java
// 2021-08-02 T:23:18:38
class Exercise_194 {

    public static String getIssuer(String cardNumber) {
        int cardNumberLength = cardNumber.length();

        switch (cardNumberLength) {
            case 15:
                String begin15 = "" + cardNumber.charAt(0) + cardNumber.charAt(1);
                if (begin15.equals("34") || begin15.equals("37")) {
                    return "AMEX";
                } else
                    return "Unknown";
            case 16:
                String begin16 = "" + cardNumber.charAt(0);
                if (begin16.equals("4")) {
                    return "VISA";
                }
                if (begin16.equals("6")) {
                    begin16 = begin16 + cardNumber.charAt(1) + cardNumber.charAt(2) + cardNumber.charAt(3);
                    if (begin16.equals("6011")) {
                        return "Discover";
                    }
                }

                if(begin16.equals("5")){
                    begin16 = begin16 + cardNumber.charAt(1);
                    if(begin16.equals("51") || begin16.equals("52") || begin16.equals("53") || begin16.equals("54") || begin16.equals("55")){
                        return "Mastercard";
                    }
                }

                return "Unknown";
            case 13:
                String begin13 = "" + cardNumber.charAt(0);
                if(begin13.equals("4")){
                    return "VISA";
                } else {
                    return "Unknown";
                }
        }

        return "Unknown";
    }
}

/*public static String getIssuer(String cn) {
    if (matches("^3[4|7].{13}$", cn)) return "AMEX";
    if (matches("^6011.{12}$", cn)) return "Discover";
    if (matches("^5[1-5].{14}$", cn)) return "Mastercard";
    if (matches("^4.{12}(...)?$", cn)) return "VISA";
    return "Unknown";
  }*/
