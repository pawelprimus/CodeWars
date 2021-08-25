package primus.pawel;
//String Task
// 7kyu
// https://www.codewars.com/kata/598ab63c7367483c890000f4/train/java
// 2021-08-25 T:12:25:28
class Exercise_200 {

    public static String perform(String word) {
        StringBuilder resultSB = new StringBuilder();
        resultSB.append(".");
        for (int i = 0; i < word.length(); i++) {
            if(!characterIsVowel(word.charAt(i))){
                resultSB.append(word.charAt(i)).append(".");
            }
        }

        return resultSB.deleteCharAt(resultSB.length()-1).toString().toLowerCase();
    }

    public static boolean characterIsVowel(Character character){
        Character lowerCaseCharacter = Character.toLowerCase(character);
        return lowerCaseCharacter == 'a' ||lowerCaseCharacter == 'o' || lowerCaseCharacter == 'y'
                || lowerCaseCharacter == 'e' || lowerCaseCharacter == 'u' ||lowerCaseCharacter == 'i';
    }
}
