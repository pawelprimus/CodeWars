package primus.pawel;
// Check three and two
// 7kyu
// https://www.codewars.com/kata/5a9e86705ee396d6be000091/train/java
// 2021-11-29 T:20:02:03
class Exercise_288_todo {

    public boolean checkThreeAndTwo(char[] chars) {
        int[] numbers = new int[26];
        boolean three = false;
        boolean two = false;
        for (int i = 0; i < chars.length; i++) {
            numbers[(int) chars[i] - 97]++;
        }

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == 3) {
                three = true;
            }
            if(numbers[i] == 2) {
                two = true;
            }
        }
        return two & three;

    }
}
