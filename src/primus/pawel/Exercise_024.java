package primus.pawel;
//7kyu
//https://www.codewars.com/kata/54c27a33fb7da0db0100040e/train/java
//2021-03-19 T:21:43:35

class Exercise_024 {

    public static boolean isSquare(int n) {
        double sqrt = Math.sqrt(n);
        return ((sqrt - Math.floor(sqrt)) == 0);
    }
    public static void main(String[] args) {

        System.out.println(isSquare(-4));

    }
}

/*public static boolean isSquare(int n) {
        return Math.sqrt(n) % 1 == 0;
    }


 public static boolean isSquare(int n) {
        long s = Math.round(Math.sqrt(n));
        return s * s == n;
    }

     public static String createPhoneNumber(int[] numbers) {
    return String.format("(%d%d%d) %d%d%d-%d%d%d%d",numbers[0],numbers[1],numbers[2],numbers[3],numbers[4],numbers[5],numbers[6],numbers[7],numbers[8],numbers[9]);


    */
