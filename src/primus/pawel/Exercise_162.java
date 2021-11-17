package primus.pawel;

import java.util.LinkedList;

// What's in a name
// 6kyu
// https://www.codewars.com/kata/59daf400beec9780a9000045/train/java
// 2021-06-24 T:22:21:40
class Exercise_162 {

    public static boolean nameInStr(String str, String name) {
        LinkedList<Character> charsQue = new LinkedList();
        for (int i = 0; i < name.length(); i++) {
            charsQue.add(name.charAt(i));
        }

        int i = 0;
        while (i < str.length() && charsQue.size() > 0) {
            if (str.charAt(i) == charsQue.getFirst()) {
                charsQue.remove();
            }
            i++;
        }
        return (charsQue.size() == 0);
    }


    public static void main(String[] args) {
        System.out.println(nameInStr("cNext hto a lake", "chris"));

    }
}
