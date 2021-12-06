package primus.pawel;
// Unique string characters
// 7kyu
// https://www.codewars.com/kata/5a262cfb8f27f217f700000b
// 2021-12-06 T:18:42:56
class Exercise_306 {

    private static int ASCI_A = 97;

    public static String solve(String a, String b){
        boolean[] aChars = new boolean[26];
        boolean[] bChars = new boolean[26];
        StringBuilder resultSB = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            aChars[(int) a.charAt(i) - ASCI_A] = true;
        }
        for (int i = 0; i < b.length(); i++) {
            bChars[(int) b.charAt(i) - ASCI_A] = true;
        }
        for (int i = 0; i < a.length(); i++) {
            bChars[(int) a.charAt(i) - ASCI_A] = false;
        }
        for (int i = 0; i < b.length(); i++) {
            aChars[(int) b.charAt(i) - ASCI_A] = false;
        }
        for (int i = 0; i < a.length(); i++) {
            if(aChars[(int) a.charAt(i) - ASCI_A]){
                resultSB.append(a.charAt(i));
            }
        }
        for (int i = 0; i < b.length(); i++) {
            if(bChars[(int) b.charAt(i) - ASCI_A]){
                resultSB.append(b.charAt(i));
            }
        }


        return resultSB.toString();
    }

    public static void main(String[] args) {
        System.out.println(solve("xyabb","xzca"));
    }

}
