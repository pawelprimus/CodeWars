package primus.pawel;

import java.util.LinkedList;

// String array duplicates
// 6kyu
// https://www.codewars.com/kata/59f08f89a5e129c543000069/train/java
// 2021-05-06 T:01:33:00
class Exercise_109 {
    public static String[] dup(String[] arr) {
        LinkedList<String> resultLS = new LinkedList<>();
        for (String word : arr) {
            resultLS.add(removeDuplicate(word));
        }

        return resultLS.toArray(new String[resultLS.size()]);
    }

    public static String removeDuplicate(String word) {
        StringBuilder result = new StringBuilder(word);
        int length = word.length() - 1;
        for (int i = 0; i < length; i++) {
            if (result.charAt(i) == result.charAt(i + 1)) {
                result.delete(i, i + 1);
                i--;
                length--;
            }
        }
        return result.toString();
    }


    public static void main(String[] args) {
        System.out.println(removeDuplicate("cccodeee"));
    }
}
/* public static String[] dup(String[] arr){
        for(int i = 0; i < arr.length; i++)
            arr[i] = arr[i].replaceAll("(.)\\1+", "$1");
        return arr;
    }
what does (.)\1+ means?
(.) matches a single character and captures it as group #1 and \1 is a backreference to that
 group that occurs 1..n times as denoted with +. For more details see e.g. https://www.regular-expressions.info/backref.html

    */