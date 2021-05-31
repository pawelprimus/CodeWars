package primus.pawel;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

// String Mix
// 4kyu
// https://www.codewars.com/kata/5629db57620258aa9d000014/train/java
// 2021-05-31 T:12:49:32
class Exercise_143 {

    public static String mix(String s1, String s2) {
        int[] asciCharsAccurancesS_1 = getAsciCharsOccurances(s1);
        int[] asciCharsAccurancesS_2 = getAsciCharsOccurances(s2);

        TreeMap<String, String> occurancesHashMap = new TreeMap<>();

        for (int i = 97; i <= 122; i++) {
            if (asciCharsAccurancesS_1[i] > asciCharsAccurancesS_2[i]) {
                asciCharsAccurancesS_2[i] = 0;
            }
            if (asciCharsAccurancesS_1[i] < asciCharsAccurancesS_2[i]) {
                asciCharsAccurancesS_1[i] = 0;
            }
        }

        for (int i = 97; i <= 122; i++) {
            if (asciCharsAccurancesS_1[i] > 1) {
                occurancesHashMap.put(String.valueOf((char) i).repeat(asciCharsAccurancesS_1[i]), "1");
            }
        }
        StringBuilder concatenatedChars = new StringBuilder();
        for (int i = 97; i <= 122; i++) {
            if (asciCharsAccurancesS_2[i] > 1) {
                concatenatedChars.append(String.valueOf((char) i).repeat(asciCharsAccurancesS_2[i]));

                if (occurancesHashMap.containsKey(concatenatedChars.toString())) {
                    occurancesHashMap.replace(concatenatedChars.toString(), "=");
                } else {
                    occurancesHashMap.put(concatenatedChars.toString(), "2");
                }
                concatenatedChars.delete(0, concatenatedChars.length());
            }
        }

        List<String> list=new LinkedList<>();

        occurancesHashMap.entrySet().forEach(entry -> {
            list.add(entry.getValue() + ":" + entry.getKey() + "/");
        });

        list.sort(Comparator.comparing(String::length).reversed().thenComparing(Comparator.naturalOrder()));



        StringBuilder result = new StringBuilder();
        for (String str : list) {
            System.out.println(str);
            result.append(str);
        }

        return (result.length()>0) ? result.deleteCharAt(result.length()-1).toString() : "";

    }

    public static int[] getAsciCharsOccurances(String s) {
        int[] asciCharsAccurances = new int[126];
        for (char ch : s.toCharArray()) {
            asciCharsAccurances[ch]++;
        }
        return asciCharsAccurances;
    }



    public static void main(String[] args) {
        //mix("Are they here", "yes, they are here");
        mix("looping is fun but dangerous", "less dangerous than coding");
    }
}
