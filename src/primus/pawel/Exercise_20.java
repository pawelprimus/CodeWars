package primus.pawel;

//2021-03-16 T:18:21:44
//https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1/train/java

class Exercise_20 {

    public static int duplicateCount(String text) {
        // Write your code here
        text = text.toUpperCase();
        int result = 0;
        int[] resultTab = new int[126];
        for (int i = 0; i < text.length(); i++) {
            //System.out.println((int)text.charAt(i));
            resultTab[(int) text.charAt(i)]++;
        }

        for (int i = 0; i < resultTab.length; i++) {
            if (resultTab[i] > 1){
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(duplicateCount("indivisibility"));

    }


}
