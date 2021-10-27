package primus.pawel;

// Bits Battle
// 7kyu
// https://www.codewars.com/kata/58856a06760b85c4e6000055/train/java
// 2021-10-24 T:20:35:47
class Exercise_259 {


    static String bitsBattle(int[] numbers) {

        int odsPower = 0;
        int evensPower = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                if (numbers[i] % 2 == 0) {
                    evensPower += getPowerOfNumber(numbers[i]);
                } else {
                    odsPower += getPowerOfNumber(numbers[i]);
                }
            }

        }

        if (odsPower == evensPower) {
            return "tie";
        }
        System.out.println(odsPower);
        System.out.println(evensPower);
        return odsPower > evensPower ? "odds win" : "evens win";
    }

    public static int getPowerOfNumber(int number) {

        String binary = Integer.toBinaryString(number);
        int ones = 0;
        int zeros = 0;
        System.out.println(number);
        for (int i = 0; i < binary.length(); i++) {

            if (binary.charAt(i) == 48) {
                zeros++;
            } else {
                ones++;
            }
        }
        System.out.println(zeros);
        System.out.println(ones);
        return number % 2 == 0 ? zeros : ones;
    }

    public static void main(String[] args) {
        System.out.println(bitsBattle(new int[]{0}));
    }
}
