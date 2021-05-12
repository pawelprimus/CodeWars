package primus.pawel;

// Reversing a process
// 6kyu
// https://www.codewars.com/kata/5dad6e5264e25a001918a1fc/train/java
// 2021-05-12 T:20:54:04
class Exercise_123 {

    public static String decode(String r) {

        StringBuilder codeNumber = new StringBuilder();
        StringBuilder result = new StringBuilder();
        int z = 0;
        while (Character.isDigit(r.charAt(z))) {
            codeNumber.append(r.charAt(z));
            z++;
        }

        for (int i = z; i < r.length(); i++) {
            //  System.out.println(Integer.valueOf(r.charAt(i)));
            result.append(codeChar(r.charAt(i), Integer.parseInt(codeNumber.toString())));
        }

        return result.toString();
    }

    public static Character codeChar(char charToCode, int password) {
      //  int charNum = (charToCode - 97) * password % 26;
        int charNum = modInverse( charToCode - 97) * password) ,26 ));
        System.out.println(modInverse((charToCode - 97) * password, 26));
        return ((char) (charNum + 97));
    }

    static int modInverse(int a, int m)
    {

        for (int x = 1; x < m; x++)
            if (((a%m) * (x%m)) % m == 1)
                return x;
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(decode("6015ekx"));
        System.out.println((6015%26));
        System.out.println();
        System.out.println();
    }
}
