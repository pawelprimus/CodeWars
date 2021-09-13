package primus.pawel;

// Ch4113ng3
// 7kyu
// https://www.codewars.com/kata/59e9f404fc3c49ab24000112/train/java
// 2021-09-13 T:18:34:08
class Exercise_221 {
    public static String nerdify(String txt) {
        StringBuilder nerdyTxt = new StringBuilder();
        for (int i = 0; i < txt.length(); i++) {
            nerdyTxt.append(changeLetterToNumber(txt.charAt(i)));
        }
        return nerdyTxt.toString();
    }


    /*Replace all 'a'/'A' with 4, 'e'/'E' with 3 and 'l' with 1*/

    public static char changeLetterToNumber(char charToChange) {
        if (charToChange == 'a' || charToChange == 'A') {
            return '4';
        } else if (charToChange == 'e' || charToChange == 'E') {
            return '3';
        } else if (charToChange == 'l') {
            return '1';
        } else
            return charToChange;
    }

}

/*  public static String nerdify(String txt){

    return txt.replaceAll("[aA]", "4").replaceAll("[eE]", "3").replace("l", "1");
  }
  */