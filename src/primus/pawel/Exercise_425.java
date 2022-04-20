package primus.pawel;

// How many urinals are free?
// 7kyu
// https://www.codewars.com/kata/5e2733f0e7432a000fb5ecc4/train/java
// 2022-04-20 T:22:52:59
class Exercise_425 {

    public static int getFreeUrinals(String urinals) {
        if (urinals.length() == 0) {
            return 0;
        }
        if (urinals.length() == 1) {
            return urinals.charAt(0) == '0' ? 1 : 0;
        }
        if (urinals.contains("11")) {
            return -1;
        }
        if (urinals.length() == 2) {
            return (urinals.charAt(0) == '0' && urinals.charAt(1) == '0') ? 1 : 0;
        }
        int freeUrinals = 0;
        StringBuilder sb = new StringBuilder(urinals);
        if (sb.charAt(0) == '0' && sb.charAt(1) == '0') {
            sb.replace(0, 1, "1");
            freeUrinals++;
        }
        if (sb.charAt(sb.length() - 2) == '0' && sb.charAt(sb.length() - 1) == '0') {
            sb.replace(sb.length() - 1, sb.length(), "1");
            freeUrinals++;
        }
        for (int i = 1; i < sb.length() - 1; i++) {

            if (sb.charAt(i) == '0') {
                if (sb.charAt(i - 1) == '0' && sb.charAt(i + 1) == '0') {
                    sb.replace(i, i + 1, "1");
                    freeUrinals++;
                }
            }
        }
        return freeUrinals;
    }

    public static void main(String[] args) {
        getFreeUrinals("0000000");
    }

}
