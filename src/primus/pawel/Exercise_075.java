package primus.pawel;

class Exercise_075 {
    public static int dontGiveMeFive(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (!String.valueOf(i).contains("5")) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        dontGiveMeFive(4, 26);
    }

}
// return IntStream.rangeClosed(start, end).filter(x -> !String.valueOf(x).matches(".*5.*")).count();