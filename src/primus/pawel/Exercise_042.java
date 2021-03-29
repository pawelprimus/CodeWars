package primus.pawel;
// Prize Draw
// 6 kyu
// https://www.codewars.com/kata/5616868c81a0f281e500005c/train/java
// 2021-03-28 T:21:42:24

import java.util.*;

class Exercise_042 {


    public static String nthRank(String st, Integer[] we, int n) {


        if(st.isEmpty()) return "No participants";

        String[] parts = st.split(",");
        if(n>parts.length) return "Not enough participants";

        Map<String, Integer> paricipants = new LinkedHashMap<>();
        int[] weigth = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            for (int j = 0; j < parts[i].length(); j++) {
                weigth[i] += Character.valueOf(parts[i].toLowerCase().charAt(j)) - 96;
                //System.out.println(parts[i].charAt(j));
            }
            weigth[i] += parts[i].length();
            weigth[i] *= we[i];

            paricipants.put(parts[i],weigth[i]);
        }




        LinkedHashMap<String, Integer> sortedKeysMap = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> sortedValuesMap = new LinkedHashMap<>();

        paricipants.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.naturalOrder()))
                .forEachOrdered(x -> sortedKeysMap.put(x.getKey(), x.getValue()));

        //System.out.println(sortedKeysMap);

        sortedKeysMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> sortedValuesMap.put(x.getKey(), x.getValue()));

        //System.out.println(sortedValuesMap);


        Set<Map.Entry<String, Integer>> mapSet = sortedValuesMap.entrySet();
        Map.Entry<String, Integer> finalResult = (Map.Entry<String, Integer>) mapSet.toArray()[n-1];

        return finalResult.getKey();

    }

    public static Object getElementByIndex(LinkedHashMap map,int index){
        return map.get( (map.keySet().toArray())[ index ] );
    }

    public static void main(String[] args) {


        String st = "COLIN,AMANDBA,AMANDAB,CAROL,PauL,JOSEPH";
        Integer[] we = {1, 4, 4, 5, 2, 1};

        System.out.println(nthRank(st, we, 4));

    }

}

/*
*    private static final String NO_PARTICIPANTS = "No participants";
    private static final String NOT_ENOUGH_PARTICIPANTS = "Not enough participants";
* */