package primus.pawel;

// 6 kyu
// https://www.codewars.com/kata/54b724efac3d5402db00065e/train/java
// 2021-03-18 T:18:11:26


import java.util.HashMap;
import java.util.Map;

class Exercise_22 {

    public static String decode(String morseCode) {

        StringBuilder morseSentence = new StringBuilder("");
        StringBuilder morseChar = new StringBuilder("");

        if (morseCode.isEmpty() || morseCode==" ") {
            return "";
        } else {
            morseCode += " ";

            for (int i = 0; i < morseCode.length(); i++) {

                while (morseCode.charAt(i) != ' ' && i < morseCode.length() - 1) {
                    morseChar.append(morseCode.charAt(i));
                    //System.out.println(morseCode.charAt(i));
                    i++;
                }

                if (i == morseCode.length() - 1) {
                    //System.out.println("morse char final " + morseChar.toString());
                   // morseSentence.append(MorseCodeChar(morseChar.toString()));
                    morseSentence.append(morseMap.get(morseChar.toString()));
                    //System.out.println(morseSentence);
                    break;
                }

                if (morseCode.charAt(i) == ' ') {
                    if(morseChar.length()>0) {
                        morseSentence.append(morseMap.get(morseChar.toString()));
                    }
                    // System.out.println(morseSentence);
                    morseChar.delete(0, morseChar.length());
                    if (morseCode.charAt(i + 1) == ' ') {
                        morseSentence.append(" ");
                        i++;
                        i++;
                    }
                }
            }
        }

        while(morseSentence.charAt(morseSentence.length()-1) == ' '){
            morseSentence.deleteCharAt(morseSentence.length()-1);
        }
        while(morseSentence.charAt(0) == ' '){
            morseSentence.deleteCharAt(0);
        }

        return morseSentence.toString().toUpperCase();
    }

    static Map<String, String> morseMap = new HashMap<>() {{
        put("a", "b");
        put("c", "d");
        put("-.-.-.", ";");
        put("-...-", "=");
        put("---", "O");
        put("----.", "9");
        put("-..-.", "/");
        put(".-...", "&");
        put("...--", "3");
        put(".--", "W");
        put("--", "M");
        put("--..", "Z");
        put(".----.", "'");
        put("-.-.--", "!");
        put("-...", "B");
        put("..-", "U");
        put(".----", "1");
        put("-.--.-", ")");
        put(".-", "A");
        put("-....-", "-");
        put("...-", "V");
        put("...---...", "SOS");
        put("-.--", "Y");
        put("..", "I");
        put("--.-", "Q");
        put("-.", "N");
        put("..---", "2");
        put("-....", "6");
        put("---...", ";");
        put(".-.-.", "+");
        put(".--.-.", "@");
        put("....-", "4");
        put("-----", "0");
        put(".-.-.-", ".");
        put("-.-.", "C");
        put(".", "E");
        put("..-.", "F");
        put(".---", "J");
        put("-.-", "K");
        put(".-..", "L");
        put(".-.", "R");
        put("...", "S");
        put("--.", "G");
        put("---..", "8");
        put("..--..", "?");
        put("-.--.", "(");
        put(".--.", "P");
        put(".....", "5");
        put("..--.-", "_");
        put("-..", "D");
        put(".-..-.", "\"");
        put("-", "T");
        put("....", "H");
        put("--..--", ",");
        put("...-..-", "$");
        put("--...", "7");
        put("-..-", "X");
    }};

    public static String MorseCodeChar(String code) {
        String morseChar;
        switch (code) {
            case ".-":
                morseChar = "a";
                break;
            case "-...":
                morseChar = "b";
                break;
            case "-.-.":
                morseChar = "c";
                break;
            case "-..":
                morseChar = "d";
                break;
            case ".":
                morseChar = "e";
                break;
            case "..-.":
                morseChar = "f";
                break;
            case "--.":
                morseChar = "g";
                break;
            case "....":
                morseChar = "h";
                break;
            case "..":
                morseChar = "i";
                break;
            case ".---":
                morseChar = "j";
                break;
            case "-.-":
                morseChar = "k";
                break;
            case ".-..":
                morseChar = "l";
                break;
            case "--":
                morseChar = "m";
                break;
            case "-.":
                morseChar = "n";
                break;
            case "---":
                morseChar = "o";
                break;
            case ".--.":
                morseChar = "p";
                break;
            case "--.-":
                morseChar = "q";
                break;
            case ".-.":
                morseChar = "r";
                break;
            case "...":
                morseChar = "s";
                break;
            case "-":
                morseChar = "t";
                break;
            case "..-":
                morseChar = "u";
                break;
            case "...-":
                morseChar = "v";
                break;
            case ".--":
                morseChar = "w";
                break;
            case "-..-":
                morseChar = "x";
                break;
            case "-.--":
                morseChar = "y";
                break;
            case "--..":
                morseChar = "z";
                break;
            case "...---...":
                morseChar = "SOS";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + code);
        }
        return morseChar;
    }

    public static void main(String[] args) {

        System.out.println(decode(".... . -.--   .--- ..- -.. ."));
        System.out.println(decode(" . "));

    }

}
