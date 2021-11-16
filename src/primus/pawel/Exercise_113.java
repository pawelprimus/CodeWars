package primus.pawel;

// How much?
// 6kyu
// https://www.codewars.com/kata/55b4d87a3766d9873a0000d4/train/java
// 2021-05-08 T:15:23:54
class Exercise_113 {

    public static String howmuch(int m, int n) {
        if (m > n) {
            int temp = m;
            m = n;
            n = temp;
        }
        if (n < 37) return "[]";

        final int BOAT_AMOUNT = 7;
        final int CAR_AMOUNT = 9;

        StringBuilder sbResult = new StringBuilder("[");
        for (int i = m; i <= n; i++) {
            if ((i) % BOAT_AMOUNT == 2 && (i) % CAR_AMOUNT == 1) {
                sbResult.append("[M: ").append(i)
                        .append(" B: ").append(i / BOAT_AMOUNT)
                        .append(" C: ").append(i / CAR_AMOUNT)
                        .append("]");
            }
        }

        return sbResult.append("]").toString();
    }

    public static void main(String[] args) {
        System.out.println(howmuch(9991, 9991));
    }
}
