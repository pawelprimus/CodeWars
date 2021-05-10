package primus.pawel;

// Stop gninnipS My sdroW!
// 6kyu
// https://www.codewars.com/kata/5264d2b162488dc400000001/train/java
//
class Exercise_018 {

    public static String spinWords(String sentence) {
        String[] words = sentence.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 4) {
                words[i] = reversWord(words[i]);
            }
            sb.append(words[i]).append(" ");
        }

        sb.delete(sb.length() - 1, sb.length());
        return sb.toString();
    }

    public static String reversWord(String word) {
        StringBuilder sb = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            sb.append(word.charAt(i));
        }
        return sb.toString();
    }


    public static void main(String[] args) {

        System.out.println(spinWords("This is a sentence"));

    }
}


/* public String spinWords(String sentence) {
    return Arrays.stream(sentence.split(" "))
                 .map(i -> i.length() > 4 ? new StringBuilder(i).reverse().toString() : i)
                 .collect(Collectors.joining(" "));
  }*/

/*public class SpinWords {

  public String spinWords(String sentence) {
    String[] words = sentence.split(" ");
    for (int i=0; i<words.length; i++) {
      if (words[i].length() >= 5) {
        words[i] = new StringBuilder(words[i]).reverse().toString();
      }
    }
    return String.join(" ",words);
  }
  */
