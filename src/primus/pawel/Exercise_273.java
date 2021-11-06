package primus.pawel;
// Encrypt this!
// 6kyu
// https://www.codewars.com/kata/5848565e273af816fb000449/train/java
// 2021-11-06 T:11:51:35
class Exercise_273 {

    public static String encryptThis(String text) {
        if(text.length() == 0 || text.equals(null)){
            return "";
        }

        String[] wordToEncrypt = text.split(" ");
        StringBuilder result = new StringBuilder();

        for(String word : wordToEncrypt){
            result.append(encryptWord(word)).append(" ");
        }

        return result.toString().trim();
    }

    private static String encryptWord(String word){
        StringBuilder encryptedWord = new StringBuilder();

        encryptedWord.append((int)word.charAt(0));
        if(word.length()==1){
            return encryptedWord.toString();
        }

        encryptedWord.append(word.charAt(word.length()-1));
        if(word.length()==2){
            return encryptedWord.toString();
        }

        encryptedWord.append(word, 2, word.length()-1);
        encryptedWord.append(word.charAt(1));


        return encryptedWord.toString();
    }


    public static void main(String[] args) {

        encryptThis("A wise old owl lived in an oak");
        System.out.println(encryptWord("He"));
    }
}
