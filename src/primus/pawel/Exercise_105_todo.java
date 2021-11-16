package primus.pawel;

import java.util.LinkedList;

// Message validator
// 6kyu
// https://www.codewars.com/kata/5fc7d2d2682ff3000e1a3fbc/train/java
// 2021-05-02 T:20:44:23
class Exercise_105_todo {

    public static boolean isAValidMessage(String message) {
        if (message.length() == 0) return true;
        if (Character.isLetter(message.charAt(0))) return false;
        StringBuilder sb = new StringBuilder();

        LinkedList<String> numberList = new LinkedList<>();
        LinkedList<String> wordList = new LinkedList<>();

        for (int i = 0; i < message.length()-1; i++) {

            while (Character.isDigit(message.charAt(i + 1)) && i < message.length() - 1) {
                i++;
                sb.append(message.charAt(i));
            }
            numberList.add(sb.toString());
            sb.delete(0, sb.length());


            while (Character.isLetter(message.charAt(i + 1)) && i < message.length() - 1) {
                i++;
                sb.append(message.charAt(i));
            }
            wordList.add(sb.toString());
            sb.delete(0, sb.length());


            if (i == message.length() - 1) {
                if (Character.isLetter((message.charAt(i)))) {
                    wordList.add(String.valueOf(message.charAt(i)));
                } else {
                    numberList.add(String.valueOf(message.charAt(i)));
                }
                i++;
            }
        }


        for (
                String word : numberList) {
            System.out.println(word);
        }


        for (
                String word : wordList) {
            System.out.println(word);
        }

        return true;
    }

    public static void main(String[] args) {
        isAValidMessage("4code13hellocodewars");

    }

}
