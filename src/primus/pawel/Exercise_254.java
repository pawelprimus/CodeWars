package primus.pawel;

// Simple string division II
// 7kyu
// https://www.codewars.com/kata/5b8be3ae36332f341e00015e/train/java
// 2021-10-18 T:22:13:38
class Exercise_254 {

    public static int solve(String s, int k) {
        String[] stringsNumber = s.split(" ");
        int counter = 0;
        for (int i = 0; i < stringsNumber.length; i++) {
            for (int j = 0; j < stringsNumber.length; j++) {
                if (i != j) {
                    if(Integer.parseInt(stringsNumber[i] + stringsNumber[j])%k == 0){
                        counter++;
                    }
                }
            }
        }
        return counter;
    }
}
