package primus.pawel;

// Excel sheet column numbers
// 7kyu
// https://www.codewars.com/kata/55ee3ebff71e82a30000006a/train/java
// 2022-01-08 T:17:46:08
class Exercise_332 {

    private static final int ASCI_A_INDEX = 64;

    public static long titleToNumber(String title) {
        long result = 0;
        long indexPower = 1;

        for (int i = title.length() - 1; i >= 0; i--) {
            result += (title.charAt(i)-ASCI_A_INDEX)*indexPower;
            indexPower = indexPower*26;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(titleToNumber("CODEWARS"));
    }

}
