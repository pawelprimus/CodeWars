package primus.pawel;

// Word values
// 7kyu
// https://www.codewars.com/kata/598d91785d4ce3ec4f000018/train/java
// 2021-09-11 T:12:13:39
class Exercise_214 {

    public static int[] nameValue(String[] arr) {

        String word;
        int sum = 0;
        int[] arrayOfSum = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            word = arr[i];
            for (int j = 0; j < word.length(); j++) {
                if (Character.isLetter(word.charAt(j))) {
                    sum += alphabeticIndex(word.charAt(j));
                }

            }
            arrayOfSum[i] = sum*(i+1);
            sum = 0;
        }
        return arrayOfSum;
    }

    public static int alphabeticIndex(char character) {
        return Character.toLowerCase(character) - 96;
    }
}
