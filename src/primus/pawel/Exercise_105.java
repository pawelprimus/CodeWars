package primus.pawel;

import java.util.Arrays;

// Message validator
// 6kyu
// https://www.codewars.com/kata/5fc7d2d2682ff3000e1a3fbc/train/java
// 2021-05-02 T:20:44:23
class Exercise_105 {

    public static boolean isAValidMessage( String message) {

        System.out.println(message);

        if(message.length() == 0 || message == null) {
            return true;
        }
        if(Character.isLetter(message.charAt(0))){
            return false;
        }
        if(message.length() == 1 && message.charAt(0) == '0'){
            return true;
        }

        String numbers = message.replaceAll("[^0-9]", " ");
        String words = message.replaceAll("\\d+", " ");

        String[] numberArray = numbers.trim().split("\\s+");
        String[] wordsArray = words.trim().split("\\s+");

        if(numberArray.length != wordsArray.length){
            return false;
        }

        for (int i = 0; i < numberArray.length; i++) {
            if(Integer.parseInt(numberArray[i]) != wordsArray[i].length() ){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(  isAValidMessage("0"));

    }

}
