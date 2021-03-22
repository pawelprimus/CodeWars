package primus.pawel;
// 7kyu
// https://www.codewars.com/kata/5390bac347d09b7da40006f6/train/java
// 2021-03-21 T:11:48:27


class Exercise_29 {
    public static String toJadenCase(String phrase) {


        StringBuilder toJadenCaseSB = new StringBuilder("");
        try {
            if (phrase.isEmpty()) return null;
            String[] splitedWords = phrase.split("\\s+");

            for (int i = 0; i < splitedWords.length; i++) {
                splitedWords[i] = ((Character.toUpperCase(splitedWords[i].charAt(0))) + splitedWords[i].substring(1));
                //System.out.println(splitedWords[i]);
                toJadenCaseSB.append(splitedWords[i] + " ");
            }
        } catch (NullPointerException e){
            return null;
        }
        return toJadenCaseSB.toString().trim();
    }

    public static void main(String[] args) {
        toJadenCase(null);
    }
}


/*public class JadenCase {

  public String toJadenCase(String phrase) {
    if(phrase == null || phrase.equals("")) return null;

    char[] array = phrase.toCharArray();

    for(int x = 0; x < array.length; x++) {
      if(x == 0 || array[x-1] == ' ') {
        array[x] = Character.toUpperCase(array[x]);
      }
    }

    return new String(array);
  }

}

public String toJadenCase(String phrase) {
    if(phrase == null || phrase.isEmpty()) return null;
    return Arrays.stream(phrase.split("\\s+")).map(str -> Character.toUpperCase(str.charAt(0)) + str.substring(1))
        .collect(Collectors.joining(" "));
  }

    public String toJadenCase(String phrase) {

    if(phrase == ""){
      return null;
    }
    else{
      return WordUtils.capitalize(phrase);
    }
  }

*/