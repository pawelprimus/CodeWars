package primus.pawel;

import java.util.LinkedList;

// Format words into a sentence
// 6kyu
// https://www.codewars.com/kata/51689e27fe9a00b126000004/train/java
// 2021-07-03 T:14:48:17
class Exercise_169 {

    public static String formatWords(String[] words) {

        if (words == null || words.length == 0) return "";


        LinkedList<String> listOfWords = new LinkedList<>();

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 0) {
                listOfWords.add(words[i]);
            }
        }

        int sizeListOfWords = listOfWords.size();

        if (sizeListOfWords == 0) {
            return "";
        } else if (sizeListOfWords == 1) {
            return listOfWords.getFirst();
        } else if (sizeListOfWords == 2) {
            return listOfWords.get(0) + " and " + listOfWords.get(1);
        } else {
            return concatenateWordsIntoSentence(listOfWords);

        }

    }

    static String concatenateWordsIntoSentence(LinkedList<String> wordsLL) {
        StringBuilder result = new StringBuilder();
        int sizeOfWordsLL = wordsLL.size();
        for (int i = 0; i < sizeOfWordsLL - 2; i++) {
            result.append(wordsLL.get(i)).append(", ");
        }
        result.append(wordsLL.get(sizeOfWordsLL - 2)).append(" and ").append(wordsLL.get(sizeOfWordsLL - 1));

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(formatWords(new String[]{"one", "two", ""}));
    }

}

/* public static String formatWords(String[] words) {
        if (words == null || words.length == 0)
            return "";
        List<String> clearWords = new ArrayList<>(Arrays.asList(words));
        clearWords.removeIf(String::isEmpty);
        if (clearWords.isEmpty())
            return "";
        if (clearWords.size() == 1)
            return clearWords.get(0);
        String start = String.join(", ", clearWords.subList(0, clearWords.size() - 1));
        return start + " and " + clearWords.get(clearWords.size() - 1);
  }

   public static String formatWords(String[] words) {
            System.out.println(Arrays.toString(words));
            return words == null ? "" : Arrays.stream(words)
                                                .collect(Collectors.joining(", "))
                                                .replaceAll("^(, )*|(, )*(?=(\\2)|$)", "")
                                                .replaceFirst(", (?=\\S*$)", " and ");
        }

  */
