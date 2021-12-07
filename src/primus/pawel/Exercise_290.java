package primus.pawel;
// Bingo ( Or Not )
// 7kyu
// https://www.codewars.com/kata/5a1ee4dfffe75f0fcb000145/train/java
// 2021-12-06 T:18:59:40
class Exercise_290 {

        private static int B_INDEX = 2;
        private static int I_INDEX = 9;
        private static int N_INDEX = 14;
        private static int G_INDEX = 7;
        private static int O_INDEX = 15;

    public static String bingo(int[] numberArray){
        boolean[] occurences = new boolean[27];
        for (int i = 0; i < numberArray.length ;  i++) {
            if(numberArray[i] < 27){
                occurences[numberArray[i]] = true;
            }
        }
       return  (occurences[B_INDEX] & occurences[I_INDEX] & occurences[N_INDEX] & occurences[G_INDEX] & occurences[O_INDEX]) ? "WIN" : "LOSE";

    }
}
