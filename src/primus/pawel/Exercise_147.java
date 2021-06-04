package primus.pawel;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

// Shifter wrods
// 7kyu
// https://www.codewars.com/kata/603b2bb1c7646d000f900083/train/java
// 2021-06-04 T:13:28:03
class Exercise_147 {



    public static int count(String st) {
        if(st.length() == 0 )return 0;
        HashSet<String> uniqeSet = new HashSet<>();
        int counter = 0;
        String[] wordsArray = st.split(" ");
        for (int i = 0; i < wordsArray.length; i++) {
            uniqeSet.add(wordsArray[i]);
        }

        for(String word : uniqeSet){
            if(wordContainsOnlyShiftLetter(word)){
                counter++;
            }
        }
        return counter;
    }


    public static boolean wordContainsOnlyShiftLetter(String word) {
        List<Character> shihterChar = new ArrayList<>();
        shihterChar.add('H');
        shihterChar.add('I');
        shihterChar.add('N');
        shihterChar.add('O');
        shihterChar.add('S');
        shihterChar.add('X');
        shihterChar.add('Z');
        shihterChar.add('M');
        shihterChar.add('W');
        for (int i = 0; i < word.length(); i++) {
            if (!shihterChar.contains(word.charAt(i))) {
                return false;
            }
        }
        return true;
    }

}

/* static int count(String st) {
    return (int) of(st.split(" ")).distinct().filter(w -> w.matches("[HIMNOSWXZ]+")).count();
  }

    public static int count(String st) {
        return (int) Arrays.stream(st.split(" "))
                .filter(s -> s.matches("[HINOSXZMW]+"))
                .distinct()
                .count();
    }

  */
