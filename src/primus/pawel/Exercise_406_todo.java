package primus.pawel;

// Possibilities Array
// 7kyu
// https://www.codewars.com/kata/59b710ed70a3b7dd8f000027/train/java
// 2022-03-29 T:00:56:40
class Exercise_406_todo {


    public static boolean isAllPossibilities(int[] arg) {
        boolean[] flags = new boolean[arg.length];


        for (int i = 0; i < arg.length; i++) {
            if (arg[i] >= arg.length || arg[i] < 0) {
                return false;
            } else {
                flags[arg[i]] = true;
            }
        }

        for (boolean flag : flags) {
            if (!flag) {
                return false;
            }
        }

        return true;
    }


}
