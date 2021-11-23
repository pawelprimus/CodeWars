package primus.pawel;

import org.junit.platform.commons.util.StringUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Alphabetical Sequence
// 7kyu
// https://www.codewars.com/kata/5bd00c99dbc73908bb00057a/train/java
// 2021-11-23 T:21:03:37
class Exercise_274 {

    public static String alphaSeq(String s) {
        List<Character> randomCharacters = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            randomCharacters.add(Character.toLowerCase(s.charAt(i)));
        }

        List<Character> characterList = randomCharacters.stream().sorted().collect(Collectors.toList());
        StringBuilder sb = new StringBuilder();
        String stringToAdd;
        for (int i = 0; i < characterList.size(); i++) {
            stringToAdd = String.join("", Collections.nCopies(characterList.get(i) - 96, characterList.get(i).toString()));
            sb.append(stringToAdd.substring(0,1).toUpperCase() + stringToAdd.substring(1).toLowerCase()).append(",");
        }
        return sb.deleteCharAt(sb.length()-1).toString();
    }


    public static void main(String[] args) {
        alphaSeq("ZpglnRxqenU");
    }

}
/*  public static String alphaSeq(String s) {
      return s.chars()
              .mapToObj(letter -> String.valueOf((char)letter))
              .map(String::toLowerCase)
              .sorted()
              .map(letter -> letter.toUpperCase() + letter.repeat(letter.charAt(0) - 'a'))
              .collect(joining(","));
  }*/