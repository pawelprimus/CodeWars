package primus.pawel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//Difference between two collections
// 7kyu
// https://www.codewars.com/kata/594093784aafb857f0000122/train/java
// 2022-01-06 T:00:31:54
class Exercise_255 {

    public static List<Character> diff(Collection<Character> a, Collection<Character> b) {
        List<Character> diffList = new ArrayList<>();
        for(Character character : a){
            if(!b.contains(character)){
                if(!diffList.contains(character)){
                    diffList.add(character);
                }

            }
        }
        for(Character character : b){
            if(!a.contains(character)){
                if(!diffList.contains(character)){
                    diffList.add(character);
                }
            }
        }
        Collections.sort(diffList);
        return diffList;
    }

    public static void main(String[] args) {

        Collection<Character> col = new ArrayList<>();
        col.add('a');
        col.add('b');
        col.add('z');
        Collection<Character> col2 = new ArrayList<>();
        col2.add('a');
        col2.add('b');
        List<Character> result = diff(col, col2);

        for(Character charac : result){
            System.out.println(charac);
        }

    }
}
