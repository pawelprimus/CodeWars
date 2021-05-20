package primus.pawel;
// Find the missing letter
// 6kyu
// https://www.codewars.com/kata/5839edaa6754d6fec10000a2/train/java
// 2021-04-02 T:22:52:39
class Exercise_053 {

    public static char findMissingLetter(char[] array)
    {
        for (int i = 0; i < array.length; i++) {
            if((int)array[i+1] - (int)array[i] != 1 ){
                return (char)((int)array[i]+1);
            }
        }
        return 0;
    }

    public static void main(String[] args) {

    }
}
