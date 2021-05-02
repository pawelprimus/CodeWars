package primus.pawel;

import java.util.LinkedList;

// Message validator
// 6 kyu
// https://www.codewars.com/kata/5fc7d2d2682ff3000e1a3fbc/train/java
// 2021-05-02 T:20:44:23
class Exercise_105_todo {

    public static boolean isAValidMessage(String message) {
        if (message.length() == 0) return true;
        if (Character.isLetter(message.charAt(0))) return false;
        int num = Character.getNumericValue(message.charAt(0));
        LinkedList<String> wordsList = new LinkedList<>();

        return true;
    }

    public static void main(String[] args) {
        isAValidMessage("4code13hellocodewars");

    }

}
