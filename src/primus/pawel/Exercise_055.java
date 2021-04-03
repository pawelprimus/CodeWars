package primus.pawel;

import java.util.*;
import java.util.stream.IntStream;

// Weight for weight
// 5kyu
// https://www.codewars.com/kata/55c6126177c9441a570000cc/train/java
// 2021-04-03 T:12:09:05
class Exercise_055 {
    public static String orderWeight(String strng) {
        String[] numArray = strng.split(" ");
        LinkedHashMap<String, Integer> weightNums = new LinkedHashMap<>();
        StringBuilder sbResult = new StringBuilder("");
        for (int i = 0; i < numArray.length; i++) {
            weightNums.put(numArray[i], Integer.valueOf(getWeight(numArray[i])));
        }

        LinkedHashMap<String, Integer> sortedKeysMap = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> sortedValuesMap = new LinkedHashMap<>();

        weightNums.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.naturalOrder()))
                .forEachOrdered(x -> sortedValuesMap.put(x.getKey(), x.getValue()));

        //System.out.println(sortedValuesMap);

        sortedValuesMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.naturalOrder()))
                .forEachOrdered(x -> sortedKeysMap.put(x.getKey(), x.getValue()));

        //System.out.println(sortedKeysMap);

        int freq = 0;
        for (String key : sortedKeysMap.keySet())
        {
            freq = Collections.frequency(Arrays.asList(numArray), key);
            for (int i = 0; i < freq; i++) {
                sbResult.append(key).append(" ");
            }
            freq = 0;
        }

        return sbResult.toString().trim();
    }

    public static String getWeight(String number) {

        StringBuilder numberSB = new StringBuilder(number);
        int newSum = 0;

            for (int i = 0; i < numberSB.length(); i++) {
                newSum += (numberSB.charAt(i) - 48);
            }

           numberSB.replace(0,numberSB.length(), String.valueOf(newSum));

        return numberSB.toString();
    }


    public static void main(String[] args) {

        System.out.println(orderWeight("2000 10003 1234000 44444444 9999 11 11 22 123"));
    }
}
